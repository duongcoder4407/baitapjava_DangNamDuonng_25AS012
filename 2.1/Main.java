public class Main {
    public static void main(String args[]){
        Author a1 = new Author("David dang","bodbi123233@gmail.com","male");
        System.out.println(a1);
        a1.setEmail("bodbi123233@gmail.com");

        System.out.println("name is" + a1.getName());
        System.out.println("email is" + a1.getEmail());
        System.out.println("gender is" + a1.getGender());

        Book b1= new Book("name",a1,1.2)
    }

}