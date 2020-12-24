package com.example.android.pets.data;

import android.provider.BaseColumns;

public final class PetContract {
    /**
     * not instantiable
     * */
    public PetContract() {}

    public static final class PetEntry implements BaseColumns {

        /**
         * name of the table in the shelter database
         */
        public static String TABLE_NAME = "pets";

        /**
         * name of the columns in the pets table
         */

        // ID of the pet
        public static String _ID = BaseColumns._ID;

        // name of the pet
        public static String COLUMN_PET_NAME = "name";

        // breed of the pet
        public static String COLUMN_PET_BREED = "breed";

        // gender of the pet
        public static String COLUMN_PET_GENDER = "gender";

        // weight of the pet
        public static String COLUMN_PET_WEIGHT = "weight";

        /**
         * possible values for the gender of the pet
         * */
        public static final int GENDER_UNKNOWN = 0;
        public static final int GENDER_MALE = 1;
        public static final int GENDER_FEMALE = 2;
    }
}
