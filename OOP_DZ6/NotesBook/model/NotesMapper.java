package OOP_DZ6.NotesBook.model;

import java.util.List;

public interface NotesMapper{

    public String map(List<Note> list);
    public List<Note> map(String text) throws Exception;

}