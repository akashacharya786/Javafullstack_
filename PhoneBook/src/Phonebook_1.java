import java.util.ArrayList;
import java.util.List;

public class Phonebook_1 {
public List<Phonebook>phonebookList = new ArrayList<>();

    public List<Phonebook> getPhonebookList() {
        return phonebookList;
    }

    public void setPhonebookList(List<Phonebook> phonebookList) {
        this.phonebookList = phonebookList;
    }
    public void addContact(Phonebook phonebook){
        phonebookList.add(phonebook);
    }
    public void deleteContact(Phonebook phonebook){
        phonebookList.remove(phonebook);
    }
//


}
