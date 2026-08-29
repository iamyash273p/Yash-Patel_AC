#include <iostream>
using namespace std;

int main(){

    int n;
    cout << "Enter the value of N: ";
    cin >> n;
    
    int count = 0;
    double arr[n];

    for(int i = 0 ; i < n; i++)
    {   
        cin >> arr[i];
    }

    for(int i = 0; i < n; i++)
    {
        if(arr[i] <= 0)
        {
            count++;
        }
    }

    int criticalIndex;

    for(int i = 0 ; i < n; i++)
    {
        if(arr[i] >= 45)
        {
            criticalIndex = i;
            break;
        }
    }

    double min = arr[0];
    double max = 0;
    double avg;
    double sum = 0;

    for(int i = 0 ; i < n; i++)
    {
        if(arr[i] < min){
            min = arr[i];
        }

        if(arr[i] > max){
            max = arr[i];
        }
    }

    for(auto i : arr)
    {
        sum = sum + i;
    }
    avg = (sum/(n-count));

    int normal = 0;
    int warning = 0;
    int critical = 0;
    int shutdown = 0;

    for(auto i : arr){

        if(i >= 0 && i <= 29){
            normal++;
        }
        else if(i >= 30 && i <= 44){
            warning++;
        }
        else if(i >= 45 && i <= 59){
            critical++;
        }
        else{
            shutdown++;
        }
    }

    cout << "Readings Entered :" << n << endl;
    cout << "Valid Reading: ";
    for(auto i : arr)
    {
        if(i > 0){
            cout << i << " ";
        }
    }
    cout << endl;
    cout << "Skipped: " << count << endl;
    cout << "First Critical: " << "Index: " << criticalIndex << " -> " << arr[criticalIndex] << endl;
    cout << "Min: " << min << "C" << " " << "Max: " << max << "C" << " " << "Avg: " << avg << "C" << endl;
    cout << "Normal: " << normal << " " << "Warinig: " << warning << " " << "Critical: " << critical << " "<< "Shutdown: " << shutdown;
    
    return 0;
}