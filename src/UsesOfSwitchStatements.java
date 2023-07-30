/*
public class UsesOfSwitchStatements {

    //Syntax of expressions in switch
    public int defineLevel(String role) {
        return switch (role) {
            case "guest" -> 0;
            case "client" -> 1;
            case "moderator" -> 2;
            case "admin" -> 3;
            default -> {
                System.out.println("non-authentic role = " + role);
                yield -1;
            }
        };
    }

    //Direct assignment of the statement switch
    public int defineLevel(String role) {
        var result = switch (role) {
            case "guest" -> 0;
            case "client" -> 1;
            case "moderator" -> 2;
            case "admin" -> 3;
            default -> {
                System.out.println("non-authentic role = " + role);
                yield -1;
            }
        };
        return result;
    }

    // List of keys in the statement switch
    int value = 1;
switch(value)

    {
        case 1, 2, 3, 4 -> System.out.println("1, 2, 3 or 4");
        case 777 -> System.out.println("Range: " + value);
        case 0 -> System.out.println("0");
        default -> System.out.println("Default");
    }

//Statement switch as a method
    System.out.println(
            switch(value)

    {
        case 2, 3, 4 -> "2,3 or 4";
        case 777 -> "Range: " + value;
        case 0 -> "0";
        default -> "Default";
    });


}
*/
