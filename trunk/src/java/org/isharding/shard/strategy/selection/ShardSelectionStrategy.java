package org.isharding.shard.strategy.selection;

import org.isharding.shard.ShardId;

/**
 * ѡ�����(Ŀǰ����ʹ��)
 * 
 * @author <a mailto="argan.wang@gmail.com">Argan Wang</a>
 */
public interface ShardSelectionStrategy {
    /**
     * ���¶���ѡ���ŵ�shard 
     * @param obj Ҫѡ��shard�Ķ���
     * @return ����Ҫ��ŵ���shard��id 
     */
    ShardId selectShardIdForNewObject(Object obj);
}
