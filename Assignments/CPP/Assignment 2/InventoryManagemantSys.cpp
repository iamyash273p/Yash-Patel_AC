#include <iostream>
using namespace std;

class Product{
    
    private:

    int productId;
    string name;
    double price;
    int quantity;

    public:

    // double totalValues();

    void acceptDetails(){
        cout << "Enter Product ID: ";
        cin >> productId;
        cout << "Enter Name: ";
        cin >> name;
        cout << "Enter Price: ";
        cin >> price;
        cout << "Enter Quantity: ";
        cin >> quantity;
    }

    void displayDetails()const{
        cout << productId << " ";
        cout << name << "   ";
        cout << price << "      ";
        cout << quantity << "     ";
        cout << totalValues();
    }
    string getName()const{
        return name;
    }

    double totalValues()const{
        return (quantity * price);
    }

    bool isLowStock(int threshold){
        if(quantity < threshold){
            return true;
        }
        else
            return false;
    }
};

    double reorderCost(int qty, double unitPrice){
        return (qty*unitPrice);
    };

    double reorderCost(double qty, double unitPrice){
        return (qty*unitPrice);
    };

    double reorderCost(int qty, double price, double taxRate){
        return ((qty*price*(taxRate/100)) + (qty*price));
    };

    double applyDiscount(double price, double discountPercent = 10.0){
        return (price - (0.01*price));
    };

int main(){
    int n;

    cout << "Enter the No of size: ";
    cin >> n;

    Product p[n];
    
    for(int i = 0; i < n; i++){
        p[i].acceptDetails();
        
    }

    int threshold;
    cout << "Enter the Threshold Value: ";
    cin >> threshold;

    // output from here //
    cout << "===== INVENTORY REPORT =====" << endl;
    cout << "ID " << "Name " << "Price " << "   Qty " << "  Total Value " << endl;
    for(int i = 0; i < n; i++){
        p[i].displayDetails();
        if(p[i].isLowStock(threshold)){
            cout << " <- Low Stock";
        }
        cout << endl;
    }

    int highestIndex = 0;
    double highestValue = p[0].totalValues();

    for(int i = 0; i < n; i++){
        if(p[i].totalValues() > highestValue){
            highestValue = p[i].totalValues();
            highestIndex = i;
        }
    }
    cout << "Highest Value: " << p[highestIndex].getName() << " " << highestValue;
    cout << "Low Stock (threshold: " << threshold << ")";

    cout << reorderCost(50, 10) << endl;
    cout <<reorderCost(100, 10) << endl;
    cout <<reorderCost(1, 50, 10) << endl;
    cout << applyDiscount(50) << endl;

    return 0;
}