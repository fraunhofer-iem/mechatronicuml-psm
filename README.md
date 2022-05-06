# MUML Platform-Specific Modeling

This repository implements the platform-specific modeling of the MUML, combining platform-independent component models with platform description models. It is part of the code generation approach for multi-ECU deployments as presented in [Pohlmann's "A model-driven software construction approach for cyber-pyhsical systems"](https://digital.ub.uni-paderborn.de/ubpb/urn/urn:nbn:de:hbz:466:2-30659). 

* For the platform-independent modeling, see: https://github.com/fraunhofer-iem/mechatronicuml-pim
* For the platform description modeling (including software platform modeling with the APIML), see: https://github.com/fraunhofer-iem/mechatronicuml-pm

The platform-specific modeling functionality in this repository includes:
* Mapping the APIML to the platform-independent model using the APIMappingML
* Allocation of platform-independent model elements (i.e., components) to hardware platform parts
* Transforming Continuous Components for code generation

And, what has been updated most recently:
* org.muml.psm.container (and .edit): The MUML Deployment Configuration Model
* org.muml.psm.container.transformtaion: A QVTo model-to-model transformation, generating a Deployment Configuration from an Allocation Specification model

The Deployment Configuration is the foundation for the platform-specific "container code" generation, see: https://github.com/fraunhofer-iem/mechatronicuml-cadapter-component-container