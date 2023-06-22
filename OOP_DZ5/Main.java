package OOP_DZ5;

import OOP_DZ5.model.FileOperation;
import OOP_DZ5.model.FileOperationImpl;
import OOP_DZ5.model.Repository;
import OOP_DZ5.model.RepositoryFile;
import OOP_DZ5.controllers.UserController;
import OOP_DZ5.views.ViewUser;

public class Main {
    public static void main(String[] args) {
        FileOperation fileOperation = new FileOperationImpl("users.txt");
        Repository repository = new RepositoryFile(fileOperation);
        UserController controller = new UserController(repository);
        ViewUser view = new ViewUser(controller);
        view.run();
    }
}
//    Сделать удаление из справочника пользователей
//        * Сделать сохранение в другом формате, например, не через запятую, а через точку с запятой,
//        и разделителем - пустой строкой. Предусмотреть сохранение в старом формате.