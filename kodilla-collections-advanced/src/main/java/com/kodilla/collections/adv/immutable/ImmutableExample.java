package com.kodilla.collections.adv.immutable;

import com.kodilla.records.BookRecord;
import com.kodilla.records.TaskRecord;

public class ImmutableExample {
    public static void main(String[] args) {
        BookRecord bookRecord = new BookRecord("John Steward", "The last chance", 2022);
        System.out.println(bookRecord.author() + " " + bookRecord.title() + " " + bookRecord.year());

        TaskRecord taskRecord = new TaskRecord("Task no.1",10);
        System.out.println(taskRecord.title() + " " + taskRecord.duration() + " h");
    }
}
