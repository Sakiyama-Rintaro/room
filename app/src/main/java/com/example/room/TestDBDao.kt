package com.example.room

import androidx.room.*

@Dao
interface TestDBDao {
    /** 全データ取得 */
    @Query("SELECT * FROM TestDBEntity")
    fun getAll(): List<TestDBEntity>

    /** データ更新 */
    @Update
    fun update(testDBEntity: TestDBEntity)

    /** データ追加 */
    @Insert
    fun insert(testDBEntity: TestDBEntity)

    /** データ削除 */
    @Delete
    fun delete(testDBEntity: TestDBEntity)
}