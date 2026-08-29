#include <iostream>
#include <cmath>
using namespace std;


    double computerRMS(double *signal, int n){
        double sum;
        for(int i = 0; i < n; i++){
            sum = sum + ((*signal) * (*signal));
            *signal++;
        }
        return sqrt(sum/n);
    }
    void normalise(double *signal, int n){

        double max = abs(*signal);

        for(int i = 0 ; i < n;i++){
            if(abs(*(signal + i)) > max){
                max = abs(*(signal + i));
            }
        }
        cout << "Max: " << max << endl;

        for(int i = 0; i < n; i++){
            *(signal+i) = *(signal+i) / max;
        }

    }

    int countZeroCrossings(double *signal, int n)
    {
        int count = 0;
        for(int i = 0; i < n -1; i++)
        {
            if(*(signal+i) > 0 && (*(signal + i+1)) < 0 || *(signal+i) < 0 && (*(signal + i+1)) > 0);
            {
                count++;
            }
        }
        return count;
    }
    void applyGain(double *signal , int n, double gainFactor)
    {
        for(int i = 0; i < n; i++){
            (*(signal+i)) = (*(signal+i)) * gainFactor;
        }
    }
int main(){

    double signal[] = {0.5, -1.2, 0.8, -0.3, 1.0, -0.9, 0.1};
    int n = 7;

    double squareR = computerRMS(signal, n);
    cout <<"SquareRoot: " << squareR << endl;

    cout << "Before Normalise: " << endl;
    for(auto i : signal)
    {
        cout << i << " ";
    }
    
    normalise(signal, n);

    cout << "After Normalise: " << endl;
    for(auto i: signal)
    {
        cout << i << " "; 
    }
    cout << endl;

    int count = countZeroCrossings(signal, n);
    cout <<"Count: " << count << endl;

    double gainFactor = 0.5;

    cout << "Before gainfactor: " << endl;
    for(auto i : signal)
    {
        cout << i << " ";
    }
    
    applyGain(signal, n, gainFactor);

    cout << endl;
    cout << "After gainFactor: " << endl;
    for(auto i: signal)
    {
        cout << i << " "; 
    }
    cout << endl;


    return 0;
}