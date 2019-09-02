package tv.bangumi.aidl;

import tv.bangumi.aidl.Book;
import tv.bangumi.aidl.IBookArriveListener;

interface IBookManager{
    List<Book> getBookList();
    void addBook(in Book book);
    void registeBookArriveListener(IBookArriveListener listener);
    void unRegisteBookArriveListener(IBookArriveListener listener);
}