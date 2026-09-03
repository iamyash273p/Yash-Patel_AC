#include <iostream>
#include <cmath>
using namespace std;

namespace Physics{
    double clamp(double val, double min, double max){
        if(val < min)
            return min;
        else if(val > max) 
            return max;
        else
            return val;
    }

    double lerp(double a, double b, double t){
        return (a + ((b-a)*t));
    }
}

namespace GameMath{
    int clamp(int val, int min, int max){
        if(val < min)
            return min;
        else if(val > max) 
            return max;
        else
            return val;
    }
    double lerp(double a, double b, double t){
        return (a + ((b-a)*t));
    }

}

class Entity{

    private:

    string name;
    int health;
    int level;
    string type;

    public:
    // all setters
    Entity& setName(const string& name){
        this->name = name;
        return *this;
    }
    Entity& setHealth(int health){
        this->health = health;
        return *this;
    }
    Entity& setLevel(int level){
        this->level = level;
        return *this;
    }
    Entity& setType(const string& type){
        this->type = type;
        return *this;
    }
    
    //all getters
    string getName()const{
        return name;
    }
    int getHealth()const{
        return health;
    }
    int getLevel()const{
        return level;
    }
    string getType(){
        return type;
    }
    void displayInfo()const{
        cout << this->name << endl;
        cout << this->health << endl;
        cout << this->level << endl;
        cout << this->type << endl;
    }

};

void populateCount(int& c1, int& c2, int& c3, int& c4, int& c5, int& arrVal){
    if(arrVal == 0)
        c1++;
    else if(arrVal == 1)
        c2++;
    else if(arrVal == 2)
        c3++;
    else if(arrVal == 3)
        c4++;
    else
        c5++;
}

int main(){

    // Entity player, enemy, item;

    // player.setName("Aragon").setHealth(100).setLevel(10).setType("Player");
    // enemy.setName("Orc").setHealth(60).setLevel(5).setType("Enemy");
    // item.setName("HealthPotion").setHealth(0).setLevel(1).setType("Item");

    // player.displayInfo();
    // enemy.displayInfo();
    // item.displayInfo();

    // cout << Physics::clamp(90, 20,100) << endl;
    // cout << GameMath::clamp(5,10,20)<< endl;

    int size = 3;
    int col = 4;

    int **arr = new int*[size];

    for(int i = 0; i < size; i++){
        arr[i] = new int[col];
        for(int j = 0; j < col; j++){
            arr[i][j] = (rand()%5);
        }
    }

    int c1 = 0;
    int c2 = 0;
    int c3 = 0; 
    int c4 = 0;
    int c5 = 0; 



    cout << "======= GAME MAP (3 X 4) =======" << endl;
    for(int i = 0 ; i < size;i++){
        for(int j = 0; j < col; j++){
            cout << arr[i][j] << " ";
            populateCount(c1,c2,c3,c4,c5, arr[i][j]);
        }
        cout << endl;
    }
    cout << "Legend: 0 = Grass  1 = Water   2 = Mountain    3 = Forest  4 = Dungeon" << endl;

    cout << "Title Count: " << endl;
    cout << "Grass : " << c1 << endl;
    cout << "Water : " << c2 << endl;
    cout << "Mountain : " << c3 << endl;
    cout << "Forest : " << c4 << endl;
    cout << "Dungeon : " << c5 << endl;
    
    return 0;
}