#include <iostream>
#include <vector>

using namespace std;


class Person{
	protected:
		string firstName;
		string lastName;
		int id;
	public:
		Person(string firstName, string lastName, int identification){
			this->firstName = firstName;
			this->lastName = lastName;
			this->id = identification;
		}
		void printPerson(){
			cout<< "Name: "<< lastName << ", "<< firstName <<"\nID: "<< id << "\n"; 
		}
	
};
class Student :public Person{
	private:
		vector<int> testScores;  
	public:
 Student(string firstName,string lastName, int id,vector<int>&vect ):Person(firstName,lastName,id){
             for(int i=0;i<vect.size();i++){
                 testScores.push_back(vect[i]);
             }
         }
        char calculate(){
            int s=0;
            for(int i=0;i<testScores.size();i++){
                s=s+testScores[i];
            }
            s=s/testScores.size();
        
            if(90<=s&&s<=100){
                return 'O';
            }else if(80<=s&&s<90){
                return 'E';
            }else if(70<=s&&s<80){
                return 'A';
            }else  if(55<=s&&s<70){
                return 'P';
            }
            else if(40<=s&&s<55){
                return 'D';
            }else{
                return 'T';
            }
             }
};
int main() {
	string firstName;
  	string lastName;
	int id;
  	int numScores;
	cin >> firstName >> lastName >> id >> numScores;
  	vector<int> scores;
  	for(int i = 0; i < numScores; i++){
	  	int tmpScore;
	  	cin >> tmpScore;
		scores.push_back(tmpScore);
	}
	Student* s = new Student(firstName, lastName, id, scores);
	s->printPerson();
	cout << "Grade: " << s->calculate() << "\n";
	return 0;
}
