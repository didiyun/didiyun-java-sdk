// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: compute/v1/common.proto

package com.didiyun.compute.v1;

public final class CommonOuterClass {
  private CommonOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_didi_cloud_compute_v1_Dc2Info_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_didi_cloud_compute_v1_Dc2Info_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_didi_cloud_compute_v1_EipInfo_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_didi_cloud_compute_v1_EipInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_didi_cloud_compute_v1_EbsInfo_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_didi_cloud_compute_v1_EbsInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_didi_cloud_compute_v1_SnapInfo_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_didi_cloud_compute_v1_SnapInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_didi_cloud_compute_v1_VpcInfo_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_didi_cloud_compute_v1_VpcInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_didi_cloud_compute_v1_SubnetInfo_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_didi_cloud_compute_v1_SubnetInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_didi_cloud_compute_v1_TotalCntInfo_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_didi_cloud_compute_v1_TotalCntInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_didi_cloud_compute_v1_SgInfo_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_didi_cloud_compute_v1_SgInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_didi_cloud_compute_v1_SgRuleInfo_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_didi_cloud_compute_v1_SgRuleInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_didi_cloud_compute_v1_JobResultRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_didi_cloud_compute_v1_JobResultRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_didi_cloud_compute_v1_JobResultResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_didi_cloud_compute_v1_JobResultResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_didi_cloud_compute_v1_ListRegionAndZoneRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_didi_cloud_compute_v1_ListRegionAndZoneRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_didi_cloud_compute_v1_ListRegionAndZoneRequest_Condition_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_didi_cloud_compute_v1_ListRegionAndZoneRequest_Condition_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_didi_cloud_compute_v1_RegionData_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_didi_cloud_compute_v1_RegionData_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_didi_cloud_compute_v1_ListRegionAndZoneResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_didi_cloud_compute_v1_ListRegionAndZoneResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\027compute/v1/common.proto\022\025didi.cloud.co" +
      "mpute.v1\032\022base/v1/base.proto\032\022bill/v1/bi" +
      "ll.proto\032\034google/api/annotations.proto\"\360" +
      "\002\n\007Dc2Info\022\017\n\007dc2Uuid\030\001 \001(\t\022\014\n\004name\030\002 \001(" +
      "\t\022\022\n\ncreateTime\030\003 \001(\003\022\022\n\nupdateTime\030\004 \001(" +
      "\003\022\n\n\002ip\030\005 \001(\t\022\016\n\006status\030\006 \001(\t\022\016\n\006osType\030" +
      "\007 \001(\t\022\020\n\010platform\030\010 \001(\t\022\017\n\007imgUuid\030\t \001(\t" +
      "\022\r\n\005imgId\030\n \001(\t\022\014\n\004tags\030\013 \003(\t\022(\n\003job\030\014 \001" +
      "(\0132\033.didi.cloud.base.v1.JobInfo\022+\n\003eip\030\r" +
      " \001(\0132\036.didi.cloud.compute.v1.EipInfo\022+\n\003" +
      "ebs\030\016 \003(\0132\036.didi.cloud.compute.v1.EbsInf" +
      "o\022.\n\006region\030\017 \001(\0132\036.didi.cloud.base.v1.R" +
      "egionInfo\"\366\001\n\007EipInfo\022\n\n\002ip\030\001 \001(\t\022\017\n\007eip" +
      "Uuid\030\002 \001(\t\022\017\n\007eipTags\030\003 \003(\t\022\016\n\006status\030\004 " +
      "\001(\t\022.\n\006region\030\005 \001(\0132\036.didi.cloud.base.v1" +
      ".RegionInfo\022\022\n\ncreateTime\030\006 \001(\003\022\022\n\nupdat" +
      "eTime\030\007 \001(\003\022+\n\003dc2\030\010 \001(\0132\036.didi.cloud.co" +
      "mpute.v1.Dc2Info\022(\n\003job\030\t \001(\0132\033.didi.clo" +
      "ud.base.v1.JobInfo\"\237\002\n\007EbsInfo\022\014\n\004name\030\001" +
      " \001(\t\022\017\n\007ebsUuid\030\002 \001(\t\022\014\n\004type\030\003 \001(\t\022\014\n\004a" +
      "ttr\030\004 \001(\t\022\017\n\007ebsTags\030\005 \003(\t\0225\n\006region\030\006 \001" +
      "(\0132%.didi.cloud.base.v1.RegionAndZoneInf" +
      "o\022\022\n\ndeviceName\030\007 \001(\t\022\022\n\ncreateTime\030\010 \001(" +
      "\003\022\022\n\nupdateTime\030\t \001(\003\022(\n\003job\030\n \001(\0132\033.did" +
      "i.cloud.base.v1.JobInfo\022+\n\003dc2\030\013 \001(\0132\036.d" +
      "idi.cloud.compute.v1.Dc2Info\"\314\002\n\010SnapInf" +
      "o\022\020\n\010snapUuid\030\001 \001(\t\022\014\n\004name\030\002 \001(\t\022\025\n\rcan" +
      "BeReverted\030\003 \001(\010\022\021\n\tisGeneral\030\004 \001(\010\022\022\n\nc" +
      "reateTime\030\005 \001(\003\022\022\n\nupdateTime\030\006 \001(\003\022\014\n\004s" +
      "ize\030\007 \001(\003\022\014\n\004type\030\010 \001(\t\022+\n\003dc2\030\t \001(\0132\036.d" +
      "idi.cloud.compute.v1.Dc2Info\022+\n\003ebs\030\n \001(" +
      "\0132\036.didi.cloud.compute.v1.EbsInfo\022.\n\006reg" +
      "ion\030\013 \001(\0132\036.didi.cloud.base.v1.RegionInf" +
      "o\022(\n\003job\030\014 \001(\0132\033.didi.cloud.base.v1.JobI" +
      "nfo\"\313\001\n\007VpcInfo\022\017\n\007vpcUuid\030\001 \001(\t\022\014\n\004name" +
      "\030\002 \001(\t\022\022\n\ncreateTime\030\003 \001(\003\022\022\n\nupdateTime" +
      "\030\004 \001(\003\022\021\n\tisDefault\030\005 \001(\010\022\014\n\004cidr\030\006 \001(\t\022" +
      ".\n\006region\030\007 \001(\0132\036.didi.cloud.base.v1.Reg" +
      "ionInfo\022(\n\003job\030\010 \001(\0132\033.didi.cloud.base.v" +
      "1.JobInfo\"\243\001\n\nSubnetInfo\022\022\n\nsubnetUuid\030\001" +
      " \001(\t\022\014\n\004name\030\002 \001(\t\022\022\n\ncreateTime\030\003 \001(\003\022\022" +
      "\n\nupdateTime\030\004 \001(\003\022\021\n\tisDefault\030\005 \001(\010\022\014\n" +
      "\004cidr\030\006 \001(\t\022*\n\004zone\030\007 \001(\0132\034.didi.cloud.b" +
      "ase.v1.ZoneInfo\" \n\014TotalCntInfo\022\020\n\010total" +
      "Cnt\030\001 \001(\005\"\213\002\n\006SgInfo\022\016\n\006sgUuid\030\001 \001(\t\022\014\n\004" +
      "name\030\002 \001(\t\022\022\n\ncreateTime\030\003 \001(\003\022\022\n\nupdate" +
      "Time\030\004 \001(\003\022\021\n\tisDefault\030\005 \001(\010\022\016\n\006dc2Cnt\030" +
      "\006 \001(\003\022\021\n\tsgRuleCnt\030\007 \001(\003\022+\n\003vpc\030\010 \001(\0132\036." +
      "didi.cloud.compute.v1.VpcInfo\022.\n\006region\030" +
      "\t \001(\0132\036.didi.cloud.base.v1.RegionInfo\022(\n" +
      "\003job\030\n \001(\0132\033.didi.cloud.base.v1.JobInfo\"" +
      "\266\002\n\nSgRuleInfo\022\022\n\nsgRuleUuid\030\001 \001(\t\022\022\n\ncr" +
      "eateTime\030\002 \001(\003\022\022\n\nupdateTime\030\003 \001(\003\022\014\n\004ty" +
      "pe\030\004 \001(\t\022\020\n\010protocol\030\005 \001(\t\022\021\n\tstartPort\030" +
      "\006 \001(\003\022\017\n\007endPort\030\007 \001(\003\022\023\n\013allowedCidr\030\010 " +
      "\001(\t\022\021\n\tisDefault\030\t \001(\010\022)\n\002sg\030\n \001(\0132\035.did" +
      "i.cloud.compute.v1.SgInfo\022+\n\003vpc\030\013 \001(\0132\036" +
      ".didi.cloud.compute.v1.VpcInfo\022(\n\003job\030\014 " +
      "\001(\0132\033.didi.cloud.base.v1.JobInfo\"P\n\020JobR" +
      "esultRequest\022*\n\006header\030\001 \001(\0132\032.didi.clou" +
      "d.base.v1.Header\022\020\n\010jobUuids\030\002 \003(\t\"h\n\021Jo" +
      "bResultResponse\022(\n\005error\030\001 \001(\0132\031.didi.cl" +
      "oud.base.v1.Error\022)\n\004data\030\002 \003(\0132\033.didi.c" +
      "loud.base.v1.JobInfo\"\262\001\n\030ListRegionAndZo" +
      "neRequest\022*\n\006header\030\001 \001(\0132\032.didi.cloud.b" +
      "ase.v1.Header\022L\n\tcondition\030\002 \001(\01329.didi." +
      "cloud.compute.v1.ListRegionAndZoneReques" +
      "t.Condition\032\034\n\tCondition\022\017\n\007product\030\001 \001(" +
      "\t\"d\n\nRegionData\022\020\n\010areaName\030\001 \001(\t\022\n\n\002id\030" +
      "\002 \001(\t\022\014\n\004name\030\003 \001(\t\022*\n\004zone\030\004 \003(\0132\034.didi" +
      ".cloud.base.v1.ZoneInfo\"v\n\031ListRegionAnd" +
      "ZoneResponse\022(\n\005error\030\001 \001(\0132\031.didi.cloud" +
      ".base.v1.Error\022/\n\004data\030\002 \003(\0132!.didi.clou" +
      "d.compute.v1.RegionData2\232\002\n\006Common\022x\n\tJo" +
      "bResult\022\'.didi.cloud.compute.v1.JobResul" +
      "tRequest\032(.didi.cloud.compute.v1.JobResu" +
      "ltResponse\"\030\202\323\344\223\002\022\022\020dicloud/i/result\022\225\001\n" +
      "\021ListRegionAndZone\022/.didi.cloud.compute." +
      "v1.ListRegionAndZoneRequest\0320.didi.cloud" +
      ".compute.v1.ListRegionAndZoneResponse\"\035\202" +
      "\323\344\223\002\027\"\025dicloud/i/region/listB\207\001\n\026com.did" +
      "iyun.compute.v1P\001Z4github.com/didiyun/di" +
      "diyun-go-sdk/compute/v1;compute\370\001\001\252\002\027Did" +
      "i.Dicloud.Compute.V1\312\002\027Didi\\Dicloud\\Comp" +
      "ute\\V1b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.didiyun.base.v1.Base.getDescriptor(),
          com.didiyun.bill.v1.BillOuterClass.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
        }, assigner);
    internal_static_didi_cloud_compute_v1_Dc2Info_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_didi_cloud_compute_v1_Dc2Info_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_didi_cloud_compute_v1_Dc2Info_descriptor,
        new java.lang.String[] { "Dc2Uuid", "Name", "CreateTime", "UpdateTime", "Ip", "Status", "OsType", "Platform", "ImgUuid", "ImgId", "Tags", "Job", "Eip", "Ebs", "Region", });
    internal_static_didi_cloud_compute_v1_EipInfo_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_didi_cloud_compute_v1_EipInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_didi_cloud_compute_v1_EipInfo_descriptor,
        new java.lang.String[] { "Ip", "EipUuid", "EipTags", "Status", "Region", "CreateTime", "UpdateTime", "Dc2", "Job", });
    internal_static_didi_cloud_compute_v1_EbsInfo_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_didi_cloud_compute_v1_EbsInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_didi_cloud_compute_v1_EbsInfo_descriptor,
        new java.lang.String[] { "Name", "EbsUuid", "Type", "Attr", "EbsTags", "Region", "DeviceName", "CreateTime", "UpdateTime", "Job", "Dc2", });
    internal_static_didi_cloud_compute_v1_SnapInfo_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_didi_cloud_compute_v1_SnapInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_didi_cloud_compute_v1_SnapInfo_descriptor,
        new java.lang.String[] { "SnapUuid", "Name", "CanBeReverted", "IsGeneral", "CreateTime", "UpdateTime", "Size", "Type", "Dc2", "Ebs", "Region", "Job", });
    internal_static_didi_cloud_compute_v1_VpcInfo_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_didi_cloud_compute_v1_VpcInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_didi_cloud_compute_v1_VpcInfo_descriptor,
        new java.lang.String[] { "VpcUuid", "Name", "CreateTime", "UpdateTime", "IsDefault", "Cidr", "Region", "Job", });
    internal_static_didi_cloud_compute_v1_SubnetInfo_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_didi_cloud_compute_v1_SubnetInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_didi_cloud_compute_v1_SubnetInfo_descriptor,
        new java.lang.String[] { "SubnetUuid", "Name", "CreateTime", "UpdateTime", "IsDefault", "Cidr", "Zone", });
    internal_static_didi_cloud_compute_v1_TotalCntInfo_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_didi_cloud_compute_v1_TotalCntInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_didi_cloud_compute_v1_TotalCntInfo_descriptor,
        new java.lang.String[] { "TotalCnt", });
    internal_static_didi_cloud_compute_v1_SgInfo_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_didi_cloud_compute_v1_SgInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_didi_cloud_compute_v1_SgInfo_descriptor,
        new java.lang.String[] { "SgUuid", "Name", "CreateTime", "UpdateTime", "IsDefault", "Dc2Cnt", "SgRuleCnt", "Vpc", "Region", "Job", });
    internal_static_didi_cloud_compute_v1_SgRuleInfo_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_didi_cloud_compute_v1_SgRuleInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_didi_cloud_compute_v1_SgRuleInfo_descriptor,
        new java.lang.String[] { "SgRuleUuid", "CreateTime", "UpdateTime", "Type", "Protocol", "StartPort", "EndPort", "AllowedCidr", "IsDefault", "Sg", "Vpc", "Job", });
    internal_static_didi_cloud_compute_v1_JobResultRequest_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_didi_cloud_compute_v1_JobResultRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_didi_cloud_compute_v1_JobResultRequest_descriptor,
        new java.lang.String[] { "Header", "JobUuids", });
    internal_static_didi_cloud_compute_v1_JobResultResponse_descriptor =
      getDescriptor().getMessageTypes().get(10);
    internal_static_didi_cloud_compute_v1_JobResultResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_didi_cloud_compute_v1_JobResultResponse_descriptor,
        new java.lang.String[] { "Error", "Data", });
    internal_static_didi_cloud_compute_v1_ListRegionAndZoneRequest_descriptor =
      getDescriptor().getMessageTypes().get(11);
    internal_static_didi_cloud_compute_v1_ListRegionAndZoneRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_didi_cloud_compute_v1_ListRegionAndZoneRequest_descriptor,
        new java.lang.String[] { "Header", "Condition", });
    internal_static_didi_cloud_compute_v1_ListRegionAndZoneRequest_Condition_descriptor =
      internal_static_didi_cloud_compute_v1_ListRegionAndZoneRequest_descriptor.getNestedTypes().get(0);
    internal_static_didi_cloud_compute_v1_ListRegionAndZoneRequest_Condition_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_didi_cloud_compute_v1_ListRegionAndZoneRequest_Condition_descriptor,
        new java.lang.String[] { "Product", });
    internal_static_didi_cloud_compute_v1_RegionData_descriptor =
      getDescriptor().getMessageTypes().get(12);
    internal_static_didi_cloud_compute_v1_RegionData_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_didi_cloud_compute_v1_RegionData_descriptor,
        new java.lang.String[] { "AreaName", "Id", "Name", "Zone", });
    internal_static_didi_cloud_compute_v1_ListRegionAndZoneResponse_descriptor =
      getDescriptor().getMessageTypes().get(13);
    internal_static_didi_cloud_compute_v1_ListRegionAndZoneResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_didi_cloud_compute_v1_ListRegionAndZoneResponse_descriptor,
        new java.lang.String[] { "Error", "Data", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.AnnotationsProto.http);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.didiyun.base.v1.Base.getDescriptor();
    com.didiyun.bill.v1.BillOuterClass.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
