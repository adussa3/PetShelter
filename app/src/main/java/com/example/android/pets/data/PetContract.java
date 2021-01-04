package com.example.android.pets.data;

import android.net.Uri;
import android.provider.BaseColumns;

public final class PetContract {
    /**
     * Not instantiable
     * */
    public PetContract() {}

    /**
     * These variables are used to create the CONTENT_URI
     */
    public static final String CONTENT_AUTHORITY = "com.example.android.pets";
    public static final Uri BASE_CONTENT_URI = Uri.parse("content://" + CONTENT_AUTHORITY);
    public static final String PATH_PETS = "pets";

    public static final class PetEntry implements BaseColumns {

        /**
         * Content URI used to access the the pet data in the provider
         */
        public static final Uri CONTENT_URI = Uri.withAppendedPath(BASE_CONTENT_URI,PATH_PETS);

        /**
         * Name of the table in the 'shelter' database
         */
        public static String TABLE_NAME = "pets";

        /**
         * Unique ID number for the pet (only used in the database table)
         * Type: INTEGER
         */
        public static final String _ID = BaseColumns._ID;

        /**
         * Name of the pet
         * Type: TEXT
         */
        public static final String COLUMN_PET_NAME = "name";

        /** Breed of the pet
         * Type: TEXT
         */
        public static final String COLUMN_PET_BREED = "breed";

        /** Gender of the pet
         * Type: INTEGER
         */
        public static final String COLUMN_PET_GENDER = "gender";

        /** Weight of the pet
         * Type: INTEGER
         */
        public static final String COLUMN_PET_WEIGHT = "weight";

        /**
         * Possible values for the gender of the pet
         * */
        public static final int GENDER_UNKNOWN = 0;
        public static final int GENDER_MALE = 1;
        public static final int GENDER_FEMALE = 2;
    }
}
