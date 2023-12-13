package people;

import java.util.Arrays;

public class PersonList {
    private final Person[] persons;
    private int count;
    public PersonList(int size) {
        //! if size is less than 2, set it 2
        if (size < 2) {
            System.out.println("----- Default size will always be set by 2 -----");
            size = 2;
        }
        persons = new Person[size];
    }
    public int getSize(){return persons.length;}
    @Override
    public String toString(){return "PersonList = " + Arrays.toString(persons);}

    public boolean add(Person p) {
        //! if p is null or the array is full or p is already exists in array return false
        if (p == null) return false;
        if (count >= persons.length) return false;
        for (int i=0; i < count; i++){
            if (persons[i].equals(p)) {
                System.out.println(String.format("----- %s Already Exist -----", persons[i]));
                return false;
            }
        }
        //! Add next Person Object in current index
        persons[count] = p;
        count++;
        System.out.println(String.format("-> Add %s Success.",p));
        return true;
    }
    public Boolean isExist(Person p) {
        for (Person person: persons){
            if (person.equals(p)) return person.equals(p);
        }
        return false;
    }

    public Person[] remove(Person p) {
        int currentIndex = 0;
        for (int i = 0; i < persons.length; i++) {
            if (persons[i] != null && persons[i].equals(p)){
                System.out.println(String.format("-> Remove %s Success.",persons[i]));
                persons[i] = null;
                currentIndex = i;
            }
        }
        for (int i = currentIndex; i < persons.length - 1;i++){
            persons[i] = persons[i + 1];
        }
        return  persons;
    }
    public Person findPersonByName(String name) {
        for (Person person: persons){
            if (person != null && person.getName().equals(name)) {
                System.out.println("-> Founded !");
                return person;
            }
        }
        System.out.println("-> Not Found !");
        return null;
    }
}