#include <string>
#include <vector>
#include <iostream>
using namespace std;
string id;
void change1(){
    for(int i=0;i<id.size();i++){
        if(id[i]>='A'&&id[i]<='Z'){
            id[i]=id[i]-'A'+'a';
        }
    }
}
void change2(){
    for(int i=0;i<id.size();i++){
        if((id[i]>='a'&&id[i]<='z')||(id[i]>='0'&&id[i]<='9')||id[i]=='-'||id[i]=='_'||id[i]=='.'){
        }else{
          id.erase(i,1);  
          i--;
        }
    }
}
void change3(){
    bool check=false;
    for(int i=0;i<id.size();i++){
        if(id[i]=='.'){
            if(check){
                id.erase(i,1);
                i--;
                check=true;
            }
            else{
                check=true;
            }
        }
        else{
            check=false;
        }
    }
}
void change4(){
    while(1){
        if(id[0]=='.'){
            id.erase(0,1);
        }else{
            break;
        }
    }
    if(id[id.size()-1]=='.'){
        id.erase(id.size()-1,1);
    }
}
void change5(){
    if(id.size()==0){
        id="a";
    }
}
void change6(){
    if(id.size()>=16){
        id.erase(15,id.size()-1);
    }
    change4();
}
void change7(){
    while(1){
        if(id.size()<=2){
            id+=id[id.size()-1];
        }
        else{
            break;
        }
    }
}
string solution(string new_id) {
    id=new_id;
    string answer = "";
    change1();
    cout<<id<<"\n";
    change2();
    cout<<id<<"\n";
    change3();
    cout<<id<<"\n";
    change4();
    cout<<id<<"\n";
    change5();
    cout<<id<<"\n";
    change6();
    cout<<id<<"\n";
    change7();
    cout<<id<<"\n";
    answer=id;
    return answer;
}