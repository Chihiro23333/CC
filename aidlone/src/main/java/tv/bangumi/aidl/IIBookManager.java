package tv.bangumi.aidl;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;

import java.util.List;

/**
 * @author 朱峰 2019/8/30
 */
public interface IIBookManager extends IInterface {

    String DESC = "tv.bangumi.aidl.AIDLImpl";

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

        public static IIBookManager asInterface(IBinder iBinder) {
            IInterface iInterface = iBinder.queryLocalInterface(DESC);
            if (iInterface != null) {
                return (IIBookManager) iInterface;
            }
            return new Proxy(iBinder);
        }
    }


    class Proxy implements IIBookManager {

        static final int TRANSACTION_getBookList = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
        static final int TRANSACTION_addBook = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);

        private IBinder mRemoteBinder;

        public Proxy(IBinder mRemoteBinder) {
            this.mRemoteBinder = mRemoteBinder;
        }

        @Override
        public List<Book> getBookList() throws RemoteException {
            android.os.Parcel _data = android.os.Parcel.obtain();
            android.os.Parcel _reply = android.os.Parcel.obtain();
            java.util.List<tv.bangumi.aidl.Book> _result;
            try {
                _data.writeInterfaceToken(DESC);
                mRemoteBinder.transact(TRANSACTION_getBookList, _data, _reply, 0);
                _reply.readException();
                _result = _reply.createTypedArrayList(tv.bangumi.aidl.Book.CREATOR);
            } finally {
                _reply.recycle();
                _data.recycle();
            }
            return _result;
        }

        @Override
        public void addBook(Book book) throws RemoteException {
            android.os.Parcel _data = android.os.Parcel.obtain();
            android.os.Parcel _reply = android.os.Parcel.obtain();
            try {
                _data.writeInterfaceToken(DESC);
                if ((book != null)) {
                    _data.writeInt(1);
                    book.writeToParcel(_data, 0);
                } else {
                    _data.writeInt(0);
                }
                mRemoteBinder.transact(TRANSACTION_addBook, _data, _reply, 0);
                _reply.readException();
            } finally {
                _reply.recycle();
                _data.recycle();
            }
        }

        @Override
        public IBinder asBinder() {
            return mRemoteBinder;
        }
    }
}
