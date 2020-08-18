package ru.job4j.ex;

public class UserStore {
    public static User findUser(User[] users, String login) throws UserNotFoundException {
        User search = null;
        for (User user : users) {
                search = user;
                break;
        }
            if (search == null) {
                throw new UserNotFoundException("User is not found.");
            }
            return search;
    }

    public static boolean validate(User user) throws UserInvalidException {
        if (!user.isValid() || user.getUsername().length() < 3) {
            throw new UserInvalidException("User is not valid or user's name length is less than 3.");
        }
        return true;
    }

    public static void main(String[] args) {
        User[] users = {
                new User("Petr Arsentev", true)
        };
        try {
            User user = findUser(users, "Ivan Ivanov");
            if (validate(user)) {
                System.out.println("This user has an access");
            }

        } catch (UserInvalidException e) {
            System.out.println("User is not valid or user's name length is less than 3.");
        }
        catch (UserNotFoundException e) {
            System.out.println("User is not found.");
        }
    }
}
