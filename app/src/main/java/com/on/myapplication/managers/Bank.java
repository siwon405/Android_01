package com.on.myapplication.managers;

import com.on.myapplication.models.Account;

import java.util.ArrayList;
import java.util.List;

public class Bank {

    private static Bank sInstance = new Bank();

//    관리자
     private final static String ADMIN_ID = "admin";
     private final static String ADMIN_PASSWORD = "admin";

//    고객 계좌정보
    private List<Account> mAccountList;

//    싱글턴 패턴
    public static Bank newInstance() {
        return sInstance;
    }

    public Bank() {
        mAccountList = new ArrayList<>();
    }

    /**
     *
     * @param account 개설할 계좌정보
     */
    public void open(Account account){

    }

    /**
     * 로그인
     * @param id 아이디
     * @param password 패스워드
     * @return 해당 계좌
     */
    public Account login(String id, String password) {
        return null;
    }

    /**
     * 관리자 권한 확인
     * @param id 아이디
     * @param password 패스워드
     * @return 관리자면 true
     *
     */
    public boolean isAdmin(String id, String password) {
        return false;
    }

    /**
     * 전체 계좌 정보
     * @return
     */
    public List<Account> getmAccountList() {
        return mAccountList;
    }

}















































































