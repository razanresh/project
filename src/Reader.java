public class Reader {
    private String name;
    private String surname;
    private long numOfReadingTicket;
    private  String faculty;
    private String birthdate;
    private long telephone;


    public Reader(String name, String surname, long numOfReadingTicket, String faculty, String birthdate, long telephone) {
        this.name = name;
        this.surname = surname;
        this.numOfReadingTicket = numOfReadingTicket;
        this.faculty = faculty;
        this.birthdate = birthdate;
        this.telephone = telephone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public long getNumOfReadingTicket() {
        return numOfReadingTicket;
    }

    public void setNumOfReadingTicket(long numOfReadingTicket) {
        this.numOfReadingTicket = numOfReadingTicket;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    public long getTelephone() {
        return telephone;
    }

    public void setTelephone(long telephone) {
        this.telephone = telephone;
    }

    public void takebook(int count){
        System.out.println(getName() + " " + getSurname() + " взял " + count + " книг:");
    }
    public void takebook(Book[] books){
        for (int i = 0; i <= books.length - 1; i++) {
            if (i == books.length - 1) {
                System.out.println(books[i].getName() + ". ");
            }
            else {
                System.out.print(books[i].getName() + ", ");
            }
        }
    }
    public void returnbook(int count){
        System.out.println(getName() + " " + getSurname() + " вернул " + count + "книг: ");
    }
    public void returnbook(Book[] books){
        for (int i = 0; i <= books.length - 1; i++) {
            if (i == books.length - 1) {
                System.out.print(books[i].getName() + ". ");
            }
            else {
                System.out.print(books[i].getName() + ", ");
            }
        }
    }

}
