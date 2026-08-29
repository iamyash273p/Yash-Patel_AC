#include <iostream>
using namespace std;

int main(){

    cout << "Enter the No of floor: ";
    int n;
    cin >> n;

    double arr[n][n];

    double max = 0;
    int max_room = 1;
    int max_floor = 1;

    for(int i = 0; i < n ; i++)
    {
        for(int j = 0; j < n; j++)
        {
            cin >> arr[i][j]; 
        }
    }
    cout << "           Room 1 " << " Room 2 " << " Room 3 " << endl;
    
    for(int i = 0; i < n ; i++)
    {   
        cout << "Floor_" << (i + 1) <<  "  :  "; 
        for(int j = 0; j < n; j++)
        {
            if(arr[i][j] > max){
                max_room = j + 1;
                max_floor = i + 1;
                max = arr[i][j];
            }

            cout << arr[i][j] << "      "; 
        }
        cout << endl;
    }

    cout << "Hottest Room: " << "Floor: " << max_floor << " ,Room: " << max_room << " -> " << max << endl;;

    double highestAvg = 0;
    int hottestFloor = 0;

    for(int i = 0; i < n ;i++)
    {   
        double sum = 0;
        for(int j = 0; j < n; j++)
        {
            sum = sum + arr[i][j];
            
        }
        double avg = sum/3;
        if(avg > highestAvg)
        {
            highestAvg = avg;
            hottestFloor = (i + 1);
        }
    }
    cout << "Hottest Floor: " << "Floor: " << hottestFloor << " " << highestAvg;
    int count = 0;
    for(int i = 0; i < n ; i++)
    {
        for(int j = 0; j < n; j++)
        {
            if(arr[i][j] >= 30)
            {
                count++;
            }
        }
    }
    cout << "Room at WARNING or above: " << count << endl;
    return 0;
}