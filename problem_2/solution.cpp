#include <bits/stdc++.h>
using namespace std;

void solve(int testcases){
    int n;
    cin>>n;
    vector<int> a(n);
    for(int i=0;i<n;i++){
        cin>>a[i];
    }
    map<int,int> mp;
    int ans = 0;
    for(int i=0;i<n;i++){
        if(mp.find(a[i] + i) != mp.end()){
            ans += (mp[a[i] + i]);
        }
        mp[a[i] - i]++;
    }
    cout<<ans<<endl;
}

signed main()
{
    int t = 1;
    cin >> t;
    for (int i = 1; i <= t; i++)
    {
        solve(i);
    }
    return 0;
}