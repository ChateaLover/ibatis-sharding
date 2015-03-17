package org.isharding.shard.strategy.access;

import org.isharding.shard.Shard;

/**
 * ��shards��ִ�е�һ�β���
 * 
 * @author <a href="mailto:argan.wang@gmail.com">Argan Wang</a>
 *
 */
public interface ShardOperation {
    Object execute(Shard shard);
    
    String getOperationName();
}
