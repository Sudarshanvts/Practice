<html>

<head>
<title>Student</title>
</head>

<body>
<h1>Student</h1>
<% String firstName = " ";
String lastName = " ";
String email = " ";
String phoneNumber = " ";
String gender = " ";

String[] courses = {};

if (request.getParameter("submit") != null) {

firstName = request.getParameter("firstName");
lastName = request.getParameter("lastName");
email = request.getParameter("email");
phoneNumber = request.getParameter("phoneNumber");
gender = request.getParameter("gender");
courses = request.getParameterValues("courses");

System.out.println("First Name: " + firstName);
System.out.println("Last Name: " + lastName);
System.out.println("Email: " + email);
System.out.println("Phone Number: " + phoneNumber);
System.out.println("Gender: " + gender);
System.out.println("Courses:");


class ObjectPassDemo {
    int a, b;
 
    // Constructor
    ObjectPassDemo(int i, int j)
    {
        a = i;
        b = j;
    }
 
    // Method
    boolean equalTo(ObjectPassDemo o)
    {
        // Returns true if o is equal to the invoking
        // object notice an object is passed as an
        // argument to method
        return (o.a == a && o.b == b);
    }
}
 
// Main class

public class student{
    // MAin driver method
    public static void main(String args[])
    {
        // Creating object of above class inside main()
        ObjectPassDemo ob1 = new ObjectPassDemo(100, 22);
        ObjectPassDemo ob2 = new ObjectPassDemo(100, 22);
        ObjectPassDemo ob3 = new ObjectPassDemo(-1, -1);
 
        // Checking whether object are equal as custom
        // values
        // above passed and printing corresponding boolean
        // value
        System.out.println("ob1 == ob2: "
                           + ob1.equalTo(ob2));
        System.out.println("ob1 == ob3: "
                           + ob1.equalTo(ob3));
    }
}

for (String course : courses) 
{

System.out.println("\t" + course);

}

}

%>

<form method="post">

<label for="firstName">First Name:</label>

<input type="text" name="firstName" value="<%=firstName%>"><br>

 

<label for="lastName">Last Name:</label>

<input type="text" name="lastName" value="<%=lastName%>"><br>

 

<label for="email">Email:</label>

<input type="email" name="email" value="<%=email%>"><br>

 

<label for="phoneNumber">Phone Number:</label>

<input type="tel" name="phoneNumber" value="<%=phoneNumber%>"><br>

 

<label for="gender">Gender:</label>

<input type="radio" name="gender" value="male" <%=gender.equals("male") ? "checked" : ""%>>Male

<input type="radio" name="gender" value="female" <%=gender.equals("female") ? "checked" : ""%>>Female<br>

<input type="submit" name="submit" value="Submit">

</form>

</body>

</html>
