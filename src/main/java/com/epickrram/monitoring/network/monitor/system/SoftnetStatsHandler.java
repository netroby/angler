package com.epickrram.monitoring.network.monitor.system;

@FunctionalInterface
public interface SoftnetStatsHandler
{
    void perCpuStatistics(final int cpuId, final long processed, final long squeezed, final long dropped);
}