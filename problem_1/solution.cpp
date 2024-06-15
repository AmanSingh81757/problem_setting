#include <bits/stdc++.h>
using namespace std;

void solve(int testcases){
    int n, k;
    cin >> n;
    vector<int> a(n);
    for(int i=0;i<n;i++) cin>>a[i];
    cin>>k;

    map<int, int> mp;
    int ans = 0, left = 0, right = 0, maxx = 0;

    while(right<n){
        mp[a[right]]++;
        maxx = max(maxx, mp[a[right]]);
        if((right-left+1)-maxx<=k){
            ans= max(ans,right-left+1);
            right++;
        }
        else {
            mp[a[left]]--;
            left++;
            right++;
        }
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