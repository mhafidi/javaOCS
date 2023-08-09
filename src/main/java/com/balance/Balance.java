package com.balance;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Balance {
    public String Uuid;
    public String ID;
    public double Value;
    public long ExpirationDate;
    public double Weight;
    public Map<String, Boolean> DestinationIDs;
    public String RatingSubject;
    public Map<String, Boolean> Categories;
    public Map<String, Boolean> SharedGroups;
    //MHI public List<RITiming> Timings;
    public Map<String, Boolean> TimingIDs;
    public boolean Disabled;
    //MHI public ValueFactor Factor;
    public boolean Blocker;
    public int precision;
    public Account account;
    public boolean dirty;

    public boolean Equal(Balance o) {
        if (DestinationIDs == null || DestinationIDs.isEmpty()) {
            DestinationIDs = new HashMap<>();
            //MHI DestinationIDs.put(utils.MetaAny, true);
        }
        if (o.DestinationIDs == null || o.DestinationIDs.isEmpty()) {
            o.DestinationIDs = new HashMap<>();
            //MHI  o.DestinationIDs.put(utils.MetaAny, true);
        }
        return Objects.equals(Uuid, o.Uuid) &&
                Objects.equals(ID, o.ID) &&
                ExpirationDate == o.ExpirationDate &&
                Weight == o.Weight &&
                DestinationIDs.equals(o.DestinationIDs) &&
                Objects.equals(RatingSubject, o.RatingSubject) &&
                Categories.equals(o.Categories) &&
                SharedGroups.equals(o.SharedGroups) &&
                Disabled == o.Disabled &&
                Blocker == o.Blocker;
    }

    public boolean MatchFilter(BalanceFilter o, boolean skipIds, boolean skipExpiry) {
        if (o == null) {
            return true;
        }
        if (!skipIds && o.Uuid != null && !o.Uuid.isEmpty()) {
            return Objects.equals(Uuid, o.Uuid);
        }
        if (!skipIds && o.ID != null && !o.ID.isEmpty()) {
            return Objects.equals(ID, o.ID);
        }
        if (!skipExpiry && o.ExpirationDate != null && o.ExpirationDate.equals(0)) {
            return this.ExpirationDate==o.ExpirationDate.getTime();
        }
        return (o.Weight == null || Weight == o.Weight) &&
                (o.Blocker == null || Blocker == o.Blocker) &&
                (o.Disabled == null || Disabled == o.Disabled);
               /*MHI &&  (o.DestinationIDs == null || DestinationIDs.keySet().containsAll(o.DestinationIDs.keySet())) &&
                (o.Categories == null || Categories.keySet().containsAll(o.Categories.keySet())) &&
                (o.TimingIDs == null || TimingIDs.keySet().containsAll(o.TimingIDs.keySet())) &&
                (o.SharedGroups == null || SharedGroups.keySet().containsAll(o.SharedGroups.keySet())) &&
                (o.RatingSubject == null || Objects.equals(RatingSubject, o.RatingSubject));*/
    }

    // Define the rest of the methods similarly
}
/*

class RITiming {
    // Define the properties and methods for RITiming class
}

class BalanceFilter {
    // Define the properties and methods for BalanceFilter class
}

class ValueFactor {
    // Define the properties and methods for ValueFactor class
}

class Account {
    // Define the properties and methods for Account class
}

class utils {
    public static String MetaAny = "metaAny";
    public static String MetaDefault = "metaDefault";

    // Define utility methods used in the code
}
*/

