#include<bits/stdc++.h>
using namespace std;
int main()
{
    int n;
    cin>>n;
    vector<char> v(n);
    for(int i = 0 ; i<n ; i++)
    {
      cin >> v[i];
    }
     
     for(int i=1 ; i<n ; i++)
     {
       char temp =v[i];
       int j=i-1;

       while(j>=0 && temp<v[j])
       {
            v[j+1]=v[j];
            j=j-1;
       }
       v[j+1]  = temp;
     }
    for(int i = 0 ; i<n ; i++)
    {
      cout << v[i] << " ";
    }
    return 0;
}