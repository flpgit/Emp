package cn.mldn.dao;

import java.util.List;
import java.util.Set;

public interface IDAO<K,V>{
	public boolean doCreate(V vo) throws Exception;
	public boolean doUpdate(V vo) throws Exception;
	public boolean doRemoveBatch(Set<String> ids) throws Exception;
	public V findById(K id) throws Exception;
	public List<V> findAll() throws Exception;
	public List<V> findAllSplit(int currentPate,int lineSize) throws Exception;
	public List<V> findAllSplit(String column,String keyWord,int currentPate,int lineSize) 
			throws Exception;
	public Long getAllCount() throws Exception;
	public Long getAllCount(int currentPage,int lineSize) throws Exception;
	
	

}
