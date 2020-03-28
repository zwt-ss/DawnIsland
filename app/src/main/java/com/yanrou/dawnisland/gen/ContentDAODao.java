package com.yanrou.dawnisland.gen;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;

import com.yanrou.dawnisland.database.ContentDAO;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "CONTENT_DAO".
*/
public class ContentDAODao extends AbstractDao<ContentDAO, Void> {

    public static final String TABLENAME = "CONTENT_DAO";

    /**
     * Properties of entity ContentDAO.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property Page = new Property(0, int.class, "page", false, "PAGE");
        public final static Property PosInPage = new Property(1, int.class, "posInPage", false, "POS_IN_PAGE");
        public final static Property ParentId = new Property(2, String.class, "parentId", false, "PARENT_ID");
        public final static Property SeriesId = new Property(3, String.class, "seriesId", false, "SERIES_ID");
        public final static Property Userid = new Property(4, String.class, "userid", false, "USERID");
        public final static Property Admin = new Property(5, boolean.class, "admin", false, "ADMIN");
        public final static Property Title = new Property(6, String.class, "title", false, "TITLE");
        public final static Property Email = new Property(7, String.class, "email", false, "EMAIL");
        public final static Property Now = new Property(8, String.class, "now", false, "NOW");
        public final static Property Content = new Property(9, String.class, "content", false, "CONTENT");
        public final static Property Img = new Property(10, String.class, "img", false, "IMG");
        public final static Property Ext = new Property(11, String.class, "ext", false, "EXT");
        public final static Property Name = new Property(12, String.class, "name", false, "NAME");
        public final static Property Sage = new Property(13, boolean.class, "sage", false, "SAGE");
    }


    public ContentDAODao(DaoConfig config) {
        super(config);
    }
    
    public ContentDAODao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"CONTENT_DAO\" (" + //
                "\"PAGE\" INTEGER NOT NULL ," + // 0: page
                "\"POS_IN_PAGE\" INTEGER NOT NULL ," + // 1: posInPage
                "\"PARENT_ID\" TEXT," + // 2: parentId
                "\"SERIES_ID\" TEXT," + // 3: seriesId
                "\"USERID\" TEXT," + // 4: userid
                "\"ADMIN\" INTEGER NOT NULL ," + // 5: admin
                "\"TITLE\" TEXT," + // 6: title
                "\"EMAIL\" TEXT," + // 7: email
                "\"NOW\" TEXT," + // 8: now
                "\"CONTENT\" TEXT," + // 9: content
                "\"IMG\" TEXT," + // 10: img
                "\"EXT\" TEXT," + // 11: ext
                "\"NAME\" TEXT," + // 12: name
                "\"SAGE\" INTEGER NOT NULL );"); // 13: sage
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"CONTENT_DAO\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, ContentDAO entity) {
        stmt.clearBindings();
        stmt.bindLong(1, entity.getPage());
        stmt.bindLong(2, entity.getPosInPage());
 
        String parentId = entity.getParentId();
        if (parentId != null) {
            stmt.bindString(3, parentId);
        }
 
        String seriesId = entity.getSeriesId();
        if (seriesId != null) {
            stmt.bindString(4, seriesId);
        }
 
        String userid = entity.getUserid();
        if (userid != null) {
            stmt.bindString(5, userid);
        }
        stmt.bindLong(6, entity.getAdmin() ? 1L: 0L);
 
        String title = entity.getTitle();
        if (title != null) {
            stmt.bindString(7, title);
        }
 
        String email = entity.getEmail();
        if (email != null) {
            stmt.bindString(8, email);
        }
 
        String now = entity.getNow();
        if (now != null) {
            stmt.bindString(9, now);
        }
 
        String content = entity.getContent();
        if (content != null) {
            stmt.bindString(10, content);
        }
 
        String img = entity.getImg();
        if (img != null) {
            stmt.bindString(11, img);
        }
 
        String ext = entity.getExt();
        if (ext != null) {
            stmt.bindString(12, ext);
        }
 
        String name = entity.getName();
        if (name != null) {
            stmt.bindString(13, name);
        }
        stmt.bindLong(14, entity.getSage() ? 1L: 0L);
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, ContentDAO entity) {
        stmt.clearBindings();
        stmt.bindLong(1, entity.getPage());
        stmt.bindLong(2, entity.getPosInPage());
 
        String parentId = entity.getParentId();
        if (parentId != null) {
            stmt.bindString(3, parentId);
        }
 
        String seriesId = entity.getSeriesId();
        if (seriesId != null) {
            stmt.bindString(4, seriesId);
        }
 
        String userid = entity.getUserid();
        if (userid != null) {
            stmt.bindString(5, userid);
        }
        stmt.bindLong(6, entity.getAdmin() ? 1L: 0L);
 
        String title = entity.getTitle();
        if (title != null) {
            stmt.bindString(7, title);
        }
 
        String email = entity.getEmail();
        if (email != null) {
            stmt.bindString(8, email);
        }
 
        String now = entity.getNow();
        if (now != null) {
            stmt.bindString(9, now);
        }
 
        String content = entity.getContent();
        if (content != null) {
            stmt.bindString(10, content);
        }
 
        String img = entity.getImg();
        if (img != null) {
            stmt.bindString(11, img);
        }
 
        String ext = entity.getExt();
        if (ext != null) {
            stmt.bindString(12, ext);
        }
 
        String name = entity.getName();
        if (name != null) {
            stmt.bindString(13, name);
        }
        stmt.bindLong(14, entity.getSage() ? 1L: 0L);
    }

    @Override
    public Void readKey(Cursor cursor, int offset) {
        return null;
    }    

    @Override
    public ContentDAO readEntity(Cursor cursor, int offset) {
        ContentDAO entity = new ContentDAO( //
            cursor.getInt(offset + 0), // page
            cursor.getInt(offset + 1), // posInPage
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // parentId
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // seriesId
            cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4), // userid
            cursor.getShort(offset + 5) != 0, // admin
            cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6), // title
            cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7), // email
            cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8), // now
            cursor.isNull(offset + 9) ? null : cursor.getString(offset + 9), // content
            cursor.isNull(offset + 10) ? null : cursor.getString(offset + 10), // img
            cursor.isNull(offset + 11) ? null : cursor.getString(offset + 11), // ext
            cursor.isNull(offset + 12) ? null : cursor.getString(offset + 12), // name
            cursor.getShort(offset + 13) != 0 // sage
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, ContentDAO entity, int offset) {
        entity.setPage(cursor.getInt(offset + 0));
        entity.setPosInPage(cursor.getInt(offset + 1));
        entity.setParentId(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setSeriesId(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setUserid(cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4));
        entity.setAdmin(cursor.getShort(offset + 5) != 0);
        entity.setTitle(cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6));
        entity.setEmail(cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7));
        entity.setNow(cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8));
        entity.setContent(cursor.isNull(offset + 9) ? null : cursor.getString(offset + 9));
        entity.setImg(cursor.isNull(offset + 10) ? null : cursor.getString(offset + 10));
        entity.setExt(cursor.isNull(offset + 11) ? null : cursor.getString(offset + 11));
        entity.setName(cursor.isNull(offset + 12) ? null : cursor.getString(offset + 12));
        entity.setSage(cursor.getShort(offset + 13) != 0);
     }
    
    @Override
    protected final Void updateKeyAfterInsert(ContentDAO entity, long rowId) {
        // Unsupported or missing PK type
        return null;
    }
    
    @Override
    public Void getKey(ContentDAO entity) {
        return null;
    }

    @Override
    public boolean hasKey(ContentDAO entity) {
        // TODO
        return false;
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}
