package tv.bangumi.aidlone;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import tv.bangumi.aidl.Book;
import tv.bangumi.aidl.IBookManager;
import tv.bangumi.aidl.IIBookManager;

/**
 * @author 朱峰 2019/8/30
 */
public class MainActivity extends AppCompatActivity {

    private Button bt_getBookList;
    private Button bt_addBook;

    private IIBookManager iBookManager;
    private ServiceConnection connection;
    private IBinder.DeathRecipient deathRecipient;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_main);

        bt_getBookList = (Button) findViewById(R.id.bt_getBookList);
        bt_addBook = (Button) findViewById(R.id.bt_addBook);


        deathRecipient = new IBinder.DeathRecipient() {
            @Override
            public void binderDied() {
                if (iBookManager != null) {
                    iBookManager.asBinder().unlinkToDeath(deathRecipient, 0);
                }
                iBookManager = null;
                //重新连接
            }
        };

        connection = new ServiceConnection() {

            @Override
            public void onServiceConnected(ComponentName name, IBinder service) {
                Log.d("eeeee", "onServiceConnected");
                iBookManager = IIBookManager.Stub.asInterface(service);
                try {
                    service.linkToDeath(deathRecipient, 0);
                } catch (RemoteException e) {
                    e.printStackTrace();
                }
            }

            @Override
            public void onServiceDisconnected(ComponentName name) {
                Log.d("eeeee", "onServiceDisconnected");
            }
        };


        Intent intent = new Intent();
        intent.setPackage("tv.bangumi.aidltwo");
        intent.setAction("action.aidlService");
        boolean b = bindService(intent, connection, Context.BIND_AUTO_CREATE);
        Log.d("eeeee", b + "");

        bt_getBookList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Log.d("eeee", iBookManager.getBookList().toString());
                } catch (RemoteException e) {
                    e.printStackTrace();
                }
            }
        });

        bt_addBook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Book book = new Book();
                book.setBookId(10);
                book.setBookName("bt_addBook");
                try {
                    iBookManager.addBook(book);
                } catch (RemoteException e) {
                    e.printStackTrace();
                }
            }
        });
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (connection != null) {
            unbindService(connection);
        }
    }
}
