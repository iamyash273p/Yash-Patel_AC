#include <iostream>
using namespace std;

int main(){

    double temp;
    
    cout << "Enter the Temperature of the Store: ";
    cin >> temp;

    int statusCode;
    string status;

    if(temp < 0){
        statusCode = -1;
        status = "SENSOR_ERROR";
    }
    else if(temp >= 0 && temp <= 29){
        statusCode = 0;
        status = "NORMAL";
    }
    else if(temp >= 30 && temp <= 44){
        statusCode = 1;
        status = "WARNING";
    }
    else if(temp >= 45 && temp <= 59){
        statusCode = 1;
        status = "CRITICAL";
    }
    else{
        statusCode = 3;
        status = "SHUTDOWN";
    }

    string action;

    switch(statusCode)
    {
        case -1:
        action = "Sensor Fault -- check wiring";
        break;

        case 0:
        action = "No action required";
        break;

        case 1:
        action = "Alert sent to supervisor";
        break;

        case 2:
        action = "Cooling system triggered";
        break;

        case 3:
        action = "Emergency shutdown initiated";
        break;
    }

    double fahren = (temp * 9 / 5) + 32;

    string read = (temp < 25) ? "Below Average" : "Above Average";

    cout << "Temperature: " << temp << "C" << " / " << fahren << "F" << endl;
    cout << "Status: " << status << endl;
    cout << "Action: " << action << endl;
    cout << "Reading: " << read << endl;
    

    return 0;
}