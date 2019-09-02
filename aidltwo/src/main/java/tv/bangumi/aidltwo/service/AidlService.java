package tv.bangumi.aidltwo.service;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;
import android.support.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

import tv.bangumi.aidl.Book;
import tv.bangumi.aidl.IIBookManager;

/**
 * @author 朱峰 2019/8/30
 */
public class AidlService extends Service {

    private List<Book> bookList;


    @Override
    public void onCreate() {
        super.onCreate();
        bookList = new ArrayList<>();
        initData();
    }

    private void initData() {
        for (int i = 0; i < 5; i++) {
            Book book = new Book();
            book.setBookId(i);
            book.setBookName("book" + i);
            bookList.add(book);
        }
    }

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return binder;
    }

    private AidlBinder binder = new AidlBinder();

    private final class AidlBinder extends IIBookManager.Stub {

        @Override
        public List<Book> getBookList() {
            return bookList;
        }

        @Override
        public void addBook(Book book) {
            bookList.add(book);
        }
    }
}
