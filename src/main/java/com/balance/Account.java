package com.balance;


import java.util.Date;
import java.util.Map;

public class Account {
    public String ID;
    public Map<String, Balance> BalanceMap;
    public UnitCounters UnitCounters;
    public ActionTriggers ActionTriggers;
    public boolean AllowNegative;
    public boolean Disabled;
    public Date UpdateTime;
    public boolean executingTriggers;



    public class AccountWithAPIOpts {
        public Account Account;
        public Map<String, Object> APIOpts;
    }


    public class UnitCounters {
        // Define the structure of UnitCounters class here
    }

    public class ActionTriggers {
        // Define the structure of ActionTriggers class here
    }
}
