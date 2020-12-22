#include <bits/stdc++.h>
#include<iomanip>
using namespace std;

// Complete the solve function below.
void solve(double meal_cost, int tip_percent, int tax_percent) {
float tip=(meal_cost*tip_percent)/100;
    float tax=(meal_cost*tax_percent)/100;
    cout<<"tax="<<tax<<"\n";
    cout<<"tip="<<tip<<"\n";
    float total_cost=meal_cost+tip+tax;
    int round=total_cost;
    cout<<"total meal cost is "<<round<<"dollars .";

}

int main()
{
    double meal_cost;
    cin >> meal_cost;
    cin.ignore(numeric_limits<streamsize>::max(), '\n');

    int tip_percent;
    cin >> tip_percent;
    cin.ignore(numeric_limits<streamsize>::max(), '\n');

    int tax_percent;
    cin >> tax_percent;
    cin.ignore(numeric_limits<streamsize>::max(), '\n');

    solve(meal_cost, tip_percent, tax_percent);

    return 0;
}

