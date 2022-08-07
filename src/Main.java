import controller.Controller;
import model.MainModel;
import model.Model;
import view.EditUserView;
import view.UsersView;

public class Main {
    public static void main(String[] args) {
        Model model = new MainModel();
        UsersView usersView = new UsersView();
        Controller controller = new Controller();

        usersView.setController(controller);
        controller.setModel(model);
        controller.setUsersView(usersView);

        EditUserView editUserView = new EditUserView();
        editUserView.setController(controller);
        controller.setEditUserView(editUserView);

        usersView.fireEventShowAllUsers();
        usersView.fireEventOpenUserEditForm(126L);

        editUserView.fireEventUserChanged("name",124L,3);
        editUserView.fireEventUserDeleted(124L);

        usersView.fireEventShowDeletedUsers();

    }
}