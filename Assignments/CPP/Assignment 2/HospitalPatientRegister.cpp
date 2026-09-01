#include <iostream>
using namespace std;

class Patient{
    
    private:
    
    int id;
    string name;
    int age;
    string ward;
    const string bloodGroup;

    public:

    Patient() : id(0), name("Unknown"), age(0), ward("General"), bloodGroup("O+") {
        cout << "[Constructor] Default Patient Registered." << endl;
    }

    Patient(int id, const string& name){
        cout << "[Constructor] Emergency " << name << endl;
        this->id = id;
        this->name = name;
    }

    Patient(int id, const string& name, int age, const string& ward, const string& bg) : bloodGroup(bg){
        cout << "[Constructor] Full Admission: " << name << endl;
        this->id = id;
        this->name = name;
        this->age = age;
        this->ward = ward;
    }

    ~Patient(){
        cout << "Patient " << name << " Discharged." << endl; 
    }

    void displayRecord()const{
        cout << "ID: " << id << endl;
        cout << "Name: " << name << endl;
        cout << "Age: " << age << endl;
        cout << "Ward: " << ward << endl;
        cout << "Blood Grp: " << bloodGroup << endl;
    }

    void transferWard(const string& newWard){
        this-> ward = newWard;
        cout << "Ward Transfer: " << name << " -> " << newWard << endl;
    }

};

int main(){

    // Patient p;
    // Patient p2(1, "Raj Patel");
    // Patient p3(1001, "Meera Joshi", 34, "Cardiology", "B+");
    // p3.displayRecord();

    Patient *p = new Patient[4];
    for(int i = 0; i < 4; i++){
        p[i].displayRecord();
        
    }
    delete [] p;
    return 0;
}