class Solution {
public:
    bool isValid(vector<vector<char>>&b,int i,int j){
        for(int k=0;k<9;k++){
            if(b[i][j]==b[i][k]  && k!=j){
                return false;
            }
        }
        for(int k=0;k<9;k++){
            if(b[i][j]==b[k][j]  && k!=i){
                return false;
            }
        }
        int sr=(i/3)*3;
        int sc=(j/3)*3;
        for(int r=sr;r<sr+3;r++){
            for(int c=sc;c<sc+3;c++){
                if(b[i][j]==b[r][c] && i!=r && j!=c){
                    return false;
                }
            }
        }
        return true;
    }
    bool isValidSudoku(vector<vector<char>>& b) {
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(b[i][j]!='.' && !isValid(b,i,j)){
                    return false;
                }
            }
        }
        return true;
    }
};