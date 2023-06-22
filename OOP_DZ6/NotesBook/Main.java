package OOP_DZ6.NotesBook;

import OOP_DZ6.NotesBook.controllers.NoteController;
import OOP_DZ6.NotesBook.model.*;
import OOP_DZ6.NotesBook.views.ViewNote;

public class Main {
    public static void main(String[] args) {
        FileOperation fileOperation = new FileOperationJSON("notes.txt");
        Repository repository = new RepositoryJSON(new NotesMapperJSON(), fileOperation);
        NoteController controller = new NoteController(repository);
        ViewNote view = new ViewNote(controller);
        view.run();
    }
}