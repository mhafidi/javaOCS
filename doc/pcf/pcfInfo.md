# PCF (policy control function)

The Policy Control Function (PCF) is one of the control plane Network Functions (NFs) of the 5G core network (5GC). It performs the same function as the PCRF in 4G networks. The PCF provides policy rules for control plane functions, including network slicing, roaming, and mobility management. It also accesses subscription information for policy decisions taken by the UDR.
The PCF uses different interfaces to communicate with the other NFs or nodes – for example, the N7 interface exists between the SMF and PCF. Each of the PCF interfaces complies with a specific version of the 3GPP specification.
The 5G PCF has several features and functions, including:

   - Support for 5G QoS policy and charging control functions and the related 5G signaling interfaces. The 3GPP standards, such as N7, N15, N28, N36, and Rx, define these interfaces for the 5G PCF.

   - Collection of subscriber metrics in context with their network, usage, applications, and more. Operators analyze this information to optimize resources and make informed decisions to segment users.

   - Real-time management of subscribers, applications, and network resources based on the business rules configured for a service provider.

   - Acceleration and simplification of deployment and upgrades using a cloud-native implementation.

