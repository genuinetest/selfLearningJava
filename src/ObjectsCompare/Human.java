package ObjectsCompare;

public class Human {

    String Name;
    String Surname;
    String Height;
    String Nationality;
    String PESEL;


    public Human(String name, String surname, String height, String nationality, String PESEL) {
        this.Name = name;
        this.Surname = surname;
        this.Height = height;
        this.Nationality = nationality;
        this.PESEL = PESEL;
    }


    public String getName() {
        return Name;
    }


    public String getSurname() {
        return Surname;
    }


    public String getHeight() {
        return Height;
    }


    public String getNationality() {
        return Nationality;
    }

    public String getPESEL(){
        return PESEL;
    }


    @Override
    public boolean equals(Object obj){
        if (obj == null){
            return false;
        }
        if (obj instanceof Human){
            Human otherHuman = (Human) obj;
            return PESEL.equals(otherHuman.PESEL);
        }
        return false;
    }

    @Override
    public int hashCode(){
        return 10*Name.hashCode() + 49*Surname.hashCode() + 67*Height.hashCode() + 78*Nationality.hashCode() +
                5*PESEL.hashCode();
    }

}

