package tv.bangumi.aidl;

import tv.bangumi.aidl.Book;

interface IBookManager{
    List<Book> getBookList();
    void addBook(in Book book);
}