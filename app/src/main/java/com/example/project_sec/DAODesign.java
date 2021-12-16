package com.example.project_sec;

import com.google.android.gms.tasks.Task;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;

import java.util.HashMap;

public class DAODesign
{
    private DatabaseReference databaseReference;
    public DAODesign()
    {
        FirebaseDatabase db =FirebaseDatabase.getInstance();
        databaseReference = db.getReference(Design.class.getSimpleName());
    }
    public Task<Void> add(Design emp)
    {
        return databaseReference.push().setValue(emp);
    }

    public Task<Void> update(String key, HashMap<String ,Object> hashMap)
    {
        return databaseReference.child(key).updateChildren(hashMap);
    }
    public Task<Void> remove(String key)
    {
        return databaseReference.child(key).removeValue();
    }

    public Query get(String key)
    {
        if(key == null)
        {
            return databaseReference.orderByKey().limitToFirst(20);
        }
        return databaseReference.orderByKey().startAfter(key).limitToFirst(20);
    }

    public Query get()
    {
        return databaseReference;
    }
}