package tv.bangumi.aidl;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

import java.util.List;

/**
 * @author 朱峰 2019/8/30
 */
public interface IIBookManager extends IInterface {

    String DESC = "tv.bangumi.aidl.AIDLImpl";

    int TRANSACTION_getBookList = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
     int TRANSACTION_addBook = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);

    List<Book> getBookList() throws RemoteException;

    void addBook(Book book) throws RemoteException;

    abstract class Stub extends Binder implements IIBookManager {

        public Stub() {
            attachInterface(this, DESC);
        }

        @Override
        public IBinder asBinder() {
            return this;
        }

        @Override
        public boolean onTransact(int code, Parcel data, Parcel reply, int flags) throws RemoteException {
            switch (code) {
                case INTERFACE_TRANSACTION: {
                    reply.writeString(DESC);
                    return true;
                }
                case TRANSACTION_getBookList: {
                    data.enforceInterface(DESC);
                    java.util.List<tv.bangumi.aidl.Book> _result = this.getBookList();
                    reply.writeNoException();
                    reply.writeTypedList(_result);
                    return true;
                }
                case TRANSACTION_addBook: {
                    data.enforceInterface(DESC);
                    tv.bangumi.aidl.Book _arg0;
                    if ((0 != data.readInt())) {
                        _arg0 = tv.bangumi.aidl.Book.CREATOR.createFromParcel(data);
                    } else {
                        _arg0 = null;
                    }
                    this.addBook(_arg0);
                    reply.writeNoException();
                    return true;
                }
            }
            return super.onTransact(code, data, reply, flags);
        }
    }
}
