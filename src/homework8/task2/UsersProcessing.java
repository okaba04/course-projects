package homework8.task2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static java.util.stream.Collectors.toMap;

public class UsersProcessing {

    private List<User> buildUsersList() {
        List<User> users = new ArrayList<>();
        users.add(new User("mail@gmail.com", LocalDate.of(2019, 12, 25), "DCTeam"));
        users.add(new User("mail1@gmail.com", LocalDate.of(2019, 12, 20), "MarvelTeam"));
        users.add(new User("mail2@gmail.com", LocalDate.of(2019, 11, 19), "DCTeam"));
        users.add(new User("mail3@gmail.com", LocalDate.of(2018, 10, 7), "DCTeam"));
        users.add(new User("mail4@gmail.com", LocalDate.of(2019, 12, 16), "MarvelTeam"));
        return users;
    }

    public void filterUsersByLoginDate() {
        List<User> users = buildUsersList();
        Map<String, String> usersMap =
                users.stream()
                        .filter(user -> user.getLoginDate().isBefore(LocalDate.now().minusDays(7)))
                        .collect(toMap(User::getTeam, User::getEmail,
                                (team1, team2) -> String.join(", ", team1, team2)));
        System.out.println(usersMap);
    }
}
