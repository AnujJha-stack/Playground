//#include<iostream>
//#include<math.h>
//using namespace std;
//
//float encrypt[3][1], decrypt[3][1], a[3][3], b[3][3], mes[3][1], c[3][3];
//
//void encryption();	//encrypts the message
//void decryption();	//decrypts the message
//void getKeyMessage();	//gets key and message from user
//void inverse();		//finds inverse of key matrix
//
//int main() {
//    getKeyMessage();
//    encryption();
//    decryption();
//}
//
//void encryption() {
//    int i, j, k;
//
//    for(i = 0; i < 3; i++)
//        for(j = 0; j < 1; j++)
//            for(k = 0; k < 3; k++)
//                encrypt[i][j] = encrypt[i][j] + a[i][k] * mes[k][j];
//
//    cout<<"\nEncrypted string is: ";
//    for(i = 0; i < 3; i++)
//        cout<<(char)(fmod(encrypt[i][0], 26) + 97);
//}
//
//void decryption() {
//    int i, j, k;
//
//    inverse();
//
//    for(i = 0; i < 3; i++)
//        for(j = 0; j < 1; j++)
//            for(k = 0; k < 3; k++)
//                decrypt[i][j] = decrypt[i][j] + b[i][k] * encrypt[k][j];
//
//    cout<<"\nDecrypted string is: ";
//    for(i = 0; i < 3; i++)
//        cout<<(char)(fmod(decrypt[i][0], 26) + 97);
//
//    cout<<"\n";
//}
//
//void getKeyMessage() {
//    int i, j;
//    char msg[3];
//
//    cout<<"Enter 3x3 matrix for key (It should be inversible):\n";
//
//    for(i = 0; i < 3; i++)
//        for(j = 0; j < 3; j++) {
//            cin>>a[i][j];
//            c[i][j] = a[i][j];
//        }
//
//    cout<<"\nEnter a 3 letter string: ";
//    cin>>msg;
//
//    for(i = 0; i < 3; i++)
//        mes[i][0] = msg[i] - 97;
//}
//
//void inverse() {
//    int i, j, k;
//    float p, q;
//
//    for(i = 0; i < 3; i++)
//        for(j = 0; j < 3; j++) {
//            if(i == j)
//                b[i][j]=1;
//            else
//                b[i][j]=0;
//        }
//
//    for(k = 0; k < 3; k++) {
//        for(i = 0; i < 3; i++) {
//            p = c[i][k];
//            q = c[k][k];
//
//            for(j = 0; j < 3; j++) {
//                if(i != k) {
//                    c[i][j] = c[i][j]*q - p*c[k][j];
//                    b[i][j] = b[i][j]*q - p*b[k][j];
//                }
//            }
//        }
//    }
//
//    for(i = 0; i < 3; i++)
//        for(j = 0; j < 3; j++)
//            b[i][j] = b[i][j] / c[i][i];
//
//    cout<<"\n\nInverse Matrix is:\n";
//    for(i = 0; i < 3; i++) {
//        for(j = 0; j < 3; j++)
//            cout<<b[i][j]<<" ";
//
//        cout<<"\n";
//    }
//}
///*
//Encryption-
//Enter the Plain Text - ANUJ
//OTP - 10101
//Cipher text - DAWGR
//
//Decryption-
//Enter the Cipher Text - DAWGR
//Plain text - ANUJ
//
//
//
//
// */
#include<iostream>
#include<math.h>
using namespace std;
int main()
{
    int count=0,num,num_sq;
    cin>>num;
    num_sq=pow(num,2);
    //finding num of digit
    int dig=0, t=num_sq;
    while(t)
    {
        t/=10;
        dig++;
    }
    //dividing the number in two parts.
    int left=0, right=0;
    dig = ceil((dig/2.0));
    right = num_sq % int(pow(10,dig));
    num_sq/=pow(10,dig);
    left = num_sq;
    (left+right == num)?cout<<"Kaprekar Number":cout<<"Not a Kaprekar Number";
}