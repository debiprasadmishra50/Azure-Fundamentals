Microsoft Azure Fundamentals
======================================
	-AC 900 Exam
	- Essentially Cloud Service is computing services such as servers, databases, networking, storage and all that kind of good stuff over the internet.
	- It allows faster innovation, flexible resources, and economies of scale
	- You genreally pay for the cloud service that you use
	- This in turn lower ypur Operating Cost and allows you to run your infracture in a more efficient way.
	- It allows you to scale out as your business needs change
	- Who provide this service is referred as a cloud provider
				e.g, AWS, Azure, Google Cloud Platform(GCP)
	- The cloud provider is going to be responsible for the physical hardware that is required for you to complete your work and for keeping that upto date.
	- Every business has computing needs and to meet those computing needs , to meet those needs, cloud service provider offer wide range of different servcies.
		e.g, Compute Power - Linux Servers, web apps etc
			 Storage - Files and databases
			 Networking - VPN, peering ...etc
			 Analytics - Visualize telemetry & performance data
	- The goal of cloud computing is to make a business run more easier and to make it more efficient and this applies to small startup company as well as to large enterprise

Key Concepts
=======================
	1. High Availability - Ability to keep services up and running for a longer period of time with very little downtime
	
	2. Scalability - Ability to increase or decrease resources for a specific workload i.e, you can add additional resources to service a workload when load required it, This is called Scaling Out. You can also add additional capabilities to manage an increase in demand to the existing resource, This is called Scaling Up. It must NOT be done automatically, although it can be.
	
	3. Elasticity - Similar to Scalability, It refers to the Ability to automatically or dynamically increase or decrease resources as needed.

	4. Agility - It refers to Ability to react quickly. Most cloud services can allocate and de-allocate resources pretty quickly and these resources are provided on demand via typically a self-service portal. This results in vast amount of computing resources that you can provision (Execute ample Amount of data provided) within minutes. 
				- There isn't any manual intervention that's necessary when provisioning or de-provisioning these types of services.

	5. Fault Tolerance - Ability to remain up and running even in the event of a component or service failure. The way this works is that redundancy(the state of being no longer useful) is often built into the cloud services architecture. So if one component fails, a backup component can take its place.

	6. Disaster Recovery - Ability to recover from an event which has taken down a cloud service. it genreally can happen very quickly with automation tools.

	7. Global Reach - Ability to reach audiences around the world, because cloud services have a presence in various regions around the world, this provides organisations the ability to have a presence in those regions even if they dont have infrastructure within that region.

	8. Customer Latency Capabilities - A situation where a customer may experience slowness with a particular cloud service. This refers to latency. 

	9. Predictive Cost Consideration - The ability for an organization to get a fair prediction pf what costs are going to be incurred for particular cloud service is referred to as Predicate Cost Consideration. Tools like cost calculator make it possible to make accurate cost estimates.

	10. Tech Skills - Cloud Providers manage underlying hardware. organizations can get a workload up and running using cloud services without the in-house technical resources that they would otherwise need. Organisation should use the experts in their application that a cloud service demands.

	11. Increased Productivity - Data Centers requires a lot of hardware setup, software patching, and other IT management chores. By leveraging cloud services/computing organisations can eliminate all those need for many tasks.

	12. Security - Most cloud providers offer a broad set of policies and technologies control and expert technology skills that would provide better security than most organisations could achieve in-house on prem(premature).

Economies of Scale 
--------------------------
	- Ability of an organisation to reduce the costs while improving efficiency as a result of Operating at a larger scale versus operating at a smaller scale.
	- Because cloud providers are large businesses, they can leverage the benefits of economies of scale. In turn, they pass these benifits to the customer.

Capital and Operational Expenditure (CapEx and OpEx)
-------------------------------------------------------------
	- For a startup company it is quiet difficult to gather a capital, process stuffs, set up the infracture, data centers, instead they can do is get the services from cloud providers and start selling their products without any oppose. This refers to CapEx and OpEx.

	- CapEx - refers to spending of money on things like physical infracture and then deducting that expense from taxes over time.
			- Upfront cost which has a value that reduces over time 

	- OpEx - Sending of money on services or products that requires now and being billed for them immediately
			- Organisations can deduct the amount from tax bill within the same year in which the expense has incurred.
			- Typically no Upfront Cost, and Organisation pay as it is used.

	- Cloud Services Typically fall under the OpEx model

	- Cloud service providers operate in a Consumtion-Based model
		
		Benefits of Consumtion-Based model
		------------------------------------------
			- They charge their customers for what and for how much they use
			- No Upfront costs
			- No infracture needed
			- Pay for additional resources only when they are needed
			- Stop paying for resources when they are not needed for the organisation



Cloud Models
============================
	- There are different types of Cloud Models
	1. Public Cloud
	2. Private Cloud
	3. Hybrid Cloud

	1. Public Cloud
	------------------------
		- It is a Platform that is owned by a cloud service provider, sometimes that cloud service provider will be referred to as a hosting provider.
		- Through their public cloud offring it provides different resources and services to organisations all aroung the globe. 
		- These organisations/users will connect to those cloud services via secure connections typically over an intenet connection
		- Public cloud has several distinctive characteristics
			- the resources within a public cloud that are used by end-user are actually owned by the cloud service provider itself
			- These resources such as Storage, and CPU power are not owned by the organisation that is using them.
			- Public cloud may make their resources available to multiple organisations i.e, the resources are not restricted to one specific organisation
			- The organisation doesn't need to worry about managing and updating local hardware as everything will run on the Cloud Providers platform on their hardware.
		Use Case
		----------------
			- Organisation deploying a web-app on hardware and resources that are owned by cloud provides such as AWS or Azure
			- This helps in maintaining the web-app without worrying about the purchasing hardware, managing and installation and updation of the hardware and software that is needed for the organisation and the web-app

	2. Private Cloud
	--------------------------
		- It is owned and operated by the company that actually uses the resources that are within.
		
		- They create a cloud environment in their own physical data center and then maybe provide self-service access to the resources within that cloud to the users within that organisation.
		
		- Here the host organisation remains the owner of the all the resources and that organisation is responsible for the operation of those resources that they are providing to their end-user.

		- Key Characteristics
			- Ownership : Owner and user of  the cloud service are one in the same
			- Hardware : Owner is responsible for all HW purchases, management and maintainance
			- Users : Computing sources are not shared among other organisations
			- Connectivity : Connections to a private cloud are typically made over private connection
			- Access : Private clouds are not generally made public accessible
			- Skillset : Deep technical knowledge, needed in-house setup, manage, and maintain
		
		Use Case
		------------------
			- Organisation hosting medical data or legal data can not be exposed publically. They maintain a private cloud
			- Organisation that uses data that govt. policy requires to be kept in-country.

	3. Hybrid Cloud
	---------------------------
		- It combines both public and private clouds, It allows an organisation to host their applications wherever it makes sense
		- Key Characteristics
			- Resource Location : Some resources are going to be run in public cloud while others are going to be run in private cloud
			- Maintaince : Difficult to setup and maintain
			- Efficiency : It allows an organisation to leverage the benefits of cost and efficiency, and even scale that are available with public cloud model when necessary
			- Control : Organisation retains management control of private cloud only
			- Skillset : Tech Skills are necessary to maintain the private cloud
		
		Use Case
		------------
			- Ecommerce Site : where frontend is displayed in public cloud but the backened operation like database storing of user information is placed in private cloud.
			- Medical Profession runs mostly in this context as medical data can not be exposed to the public

Comparison Between public/private/Hybrid cloud
-----------------------------------------------------
	Public cloud
		Advantages
			- No CapEx
			- Increased Agility
			- OpEx / Pay as you use
			- No maintainance requirement
			- Fewer in-house skills are necessary
		Disadvantages
			- Less control over Security / Unmet security requirements
			- Unmet requirement compliances
			- Lack of Ownership can be seen as a disadvantage
	
	Private Cloud
		Advantages
			- Control retained by the organisation
			- Security controlled by the organisation
			- Compliance managed by the organisation
		Disadvantages
			- Upfront CapEx - Own hardware, maintaince, installation, patching, infracture ...etc
			- Less Agile
			- Maintaince and Skillset Necessity

	Hybrid Cloud
		Advantages
			- Flexible Solution
			- Cost Management
			- Security and Control
			- Compliance
		Disadvantage
			- Upfront CapEx
			- Maintainance and Skillset Necessity
			- Management Complexity


Cloud Services
====================================
		- When an organisation movees to the cloud that cloud provider is going to provide quite a few advantages and tools for security and compliances.
		- Access to these security features doesnot absolve(free from punishment) organisation from taking its own steps to secure its data, Thats where Shared Responsibility Model comes into picture.
		- 3 different services
				1. IaaS (Infracture As A Service)
				2. PaaS (Platform As A Service)
				3. SaaS (Software As A Service)
	Shared Responsibility Model
	-----------------------------------
		- Ensures cloud workloads are secured and well managed
		- Based on the service that is being used , cloud service provider may be responsible for some or all of the workload management for that particular service.
		- While the customer is responsible for other workload management

	Types of cloud services that fall under the Shared Responsibility Model
	------------------------------------------------------------------------------
		On Premises					IaaS 				PaaS 				SaaS
		--------------			---------------			------------		--------------
		Data & Access 			Data & Access 			Data & Access 		Data & Access
		Applications 			Applications 			Applications 		APPLICATIONS
		Runtime 				Runtime 				RUNTIME 			RUNTIME
		Operating System 		Operating System 		OPERATING SYSTEM 	OPERATING SYSTEM
		Virtual Machines		Virtual Machines 		VIRTUAL MACHINES 	VIRTUAL MACHINES
		Compute 				COMPUTE 				COMPUTE 			COMPUTE
		Networking 				NETWORKING 				NETWORKING 			NETWORKING
		Storage 				STORAGE 				STORAGE 			STORAGE

		CAPITAL - Handled by Cloud Provider
		Camelcase - Handled by Customer

		On Premises : Infracture as a service requires all of the cloud services handled by customer
		IaaS : Infracture As A Service requires less handling by customer
		PaaS : Platform As A Service requires even less handling by Customer
		SaaS : Software As A Service requires least amount of management from Customer side
	
	IaaS
	---------------
	- IaaS service offering is the most basic of the cloud computing services, Here you will rent your infracture from cloud provider
	- rent will include things like Servers, VM storage, Networks, and Operating Systems from cloud provider
	- It provides a quickly deployed computing infracture that is provisioned and managed over internet
	- It has Servers/Storage, Firewall/Security, Physical Datacenter

		Characteristics
		------------------------
		Costs : - No Upfront Cost
				- pay for what you use
		User Ownership : Customer is responsible for purchase, installation, configuration, and management of their own OS, apps, and middleware
		Cloud Provider Ownership : Cloud provider is responsible for underlying cloud infracture like VM and storage and networking availability
		Workload Migration : - Facilities are managed similarly to on-prem infracture
							 - Provides a migration path for moving existing apps to cloud
		Development Testing : - Quickly setup and tear down test and development
							  - Scaling dev environments up and down is fast and economical
		Website Hosting : Running Websites on IaaS is often more cheaper than traditional web hosting
		Backup & Recovery : - Avoid cost and complexity of storage management
							- Manage unpredictable demand
							- Simplify backup and recovery solutions

	PaaS
	-------------------
	- PaaS provides an environment to quickly build, test, and deploy applications
	- No need to concern with underlying infracture
	- example is an organisation developing an Web-App
	- it includes IaaS as a service
	- It is IaaS + Operating System + Software Development Kits/Tools

		Characteristics
		------------------------
		Costs : - No Upfront Cost
				- pay for what you use
		User Ownership : User is responsible for their own app development, but not responsible for managing servers or infracture.
		Cloud Provider Ownership : Cloud Provider is responsible for OS management, network configuration, and server configuration. Provider is responsible for everything except the applciation that the customer wants to run.

	- It really is good for developers as it provides a frameworkthat they can use it to build an application.
	- It offers Scalability, high-availability, and multi-tenant capabilities

	- It also offers robust analytics and business intelligence
			- Toolsa that are provided as a service, can be used to allow organisations to analyze and mine their data


	SaaS
	-----------------
	- It provides centrally hosted and managed software for end-user, who can access the software the software over the internet. Some examples of SaaS are Office 365, email, calenders.
	- They occur in an annual or monthly subscription basis.
	- It includes PaaS as a service as well
	- It is PaaS + Hosted Application

		Characteristics
		------------------------
		Costs : - No Upfront Cost
				- Supscription based usage
		User Ownership : Cuatomer uses the application, Customer is not responsible for maintainance or management of the app.
		Cloud Provider Ownership : Cloud Provider provisions, manages and maintains the application.

	- examples - Office 365, Microsoft Teams, Microsoft Dynamics CRM Online


	Comparison between IaaS, PaaS, SaaS
	----------------------------------------------
	IaaS :  - Most flexible of cloud service offering
			- Customer configures and manages hardware for apps

	PaaS : 	- Focus on application development instead of infracture
			- Cloud Provider manages the platform

	SaaS :  - Pay for the application you use on a subscription basis
			- Pay as you go Pricing

	Advantages and Disadvantages
	--------------------------------------
	IaaS : 	
			Advantages
				No CapEx (No Upfront Cost)
				Agility (quick deployment of applciation)
				Consumtion-Based Model (Pay as they Use, OpEx model)
				Skills (Deep technical skills are not needed)
				Cloud Benefits (Secure and widely available)
				Flexiblity (allows organisation to configure and manage the hardware that runs their application but it doesn not require them to pay for that stuff up front)

			Disadvantages
				Management (Takes management control away from the organisation OR out of the hands of the customer)

	PaaS : 
			Advantages
				No CapEx (No Upfront Cost)
				Agility (quick deployment of applciation)
				Consumtion-Based Model (Pay as they Use, OpEx model)
				Skills (Deep technical skills are not needed)
				Cloud Benefits (Secure and widely available)
				Productivity (Organisation focuses only on application development instead of infracture)

			Disadvantages
				Platform Limitations(Legacy applciation requiring certain OS, Not good for legacy apps solutions)
	SaaS : 
			Advantages
				No CapEx
				Agility
				Pay As You Go (Subscriptin Model Pricing)
				Flexiblity (Access from anywhere in the world)

			Disadvantages
				Software Limitations (Less Control over the Software)



****
Core Azure Services and Products
===============================================
	- Microsoft Azure consistes of multiple data centers that are located aroung the world.
	- These data centers are organised by region.
	- A region is collection of data centers.
	- Datacenters within a region are connected by low-latency network 
	- examples : 
			- East US
			- Canada Central
			- West Europe
			- Australia East
			- Japan West

	- Azure is generally available in 58 regions in 140 countries
	****
	- Azure has most no of regions than any other cloud provider
	- Because of the no of regions, customer have the flexibility and scale to host their application close to their end-users
	- They preserve data Residency for organisation that require it.
	- Regions also provide compliance(company obeying all of the legal laws and regulations in regards to how they manage the business) and resiliency (the capacity to recover quickly from difficulties, toughness)

	- Azure Active Directory, Azure Traffic Manager, Azure DNS are NOT tied down to any region
	- Some services are available in certain regions
			VM sizes and storage types are only available in subset of regions

	Region Pairs
	=======================
		- Each Azure region is paired with another region within the same geography, kanown as region pair
		- The lone exception is Brazil South, as it is actually paired with region outside its geography,to South Central Us

		- They provide 
				- Physical Isolation (Azure prefers atleast 300 miles of separation distance between regions)
				- Platform-provided replication (Some services provide autoimatic replication to the paired region)
				- Priority Recovery (In an outage, recovery of one region is prioritize out of every pair)
				- Sequential Updates (System updates are rolled out to paired regions sequentially)
				- Data Residency 

		Region 					Paired Region
		--------				-------------------
		North Central US 		South Central US
		East US 				West US
		West US 2				West Central US
		US East 2				Central US
		Canada Central 			Canada East
		North Europe 			West Europe
		UK West 				UK South
		Germany Central 		Germany NorthEast
		South East Asia 		East Asia
		East China 				North China
		Japan East 				Japan West
		Australia SouthEast 	Australia West
		India South 			India Central
		Brazil South (Primary) 	South Central US

	Geography
	-------------------
		- Discrete markets that preserve data residency and compliace and resiliency
		- Typically contain 2 or more regions
		- Allow customers with specific data-residency and compliance needs to keep their data and applications in close proximity
		- There are 5 Geographies
				1. Americas
				2. Europe
				3. Asia Pacific
				4. Middle East
				5. Africa
	
	Availability Options
	--------------------------
		- VM that are deployed with premium storage already have 99.9% of SLA (Service Level Aggrement)
		- Organisations can instantly incerase this SLA to 99.95% by placeing Virtual Machines in an Availability Set which protects against failures within data centers
		- It can further incerased to 99.99% by adding Virtual Machines to Availability Zones, they protect against complete data center failures. This is the highest level of protection that is provided.
		
		Availability Set
		---------------------	
			- These keep the applciation running online during maintainance or hardware failure
			- They comprises of Update Domains and Fault Domains

				Update Domain: Scheduled maintenance, performance or security updates are sequenced through update domains.
								It is basically a logical section of a data center that is created with software and logic

				Fault Domain : Provide a physical separation of workloads across different hardware in a datacenter
								These separation includes power, cooling, network hardware that supports the physical servers located in server racks

		Availability Zones
		---------------------------
			- Physically separate locations within an Azure regions
			- Takes Availability Sets to next level
			- it includes one or more data centers equipped with independent power, cooling, and networking.
			- It acts as a Isolation boundary 
			- If one zone goes down, the other continues working

	Resource Groups
	-------------------------------
		- It is a logical management grouping for resources in Azure
		- It is a container for multiple resources that share the same life cycle.
		- It Aggregates resources into a single manageable units
		- You can manage Metering and Billing, Apply and Manage Policies, Monitoring and Alerts, Quota Management, Access Control at this level.
		- Every resource must exist in one resource group, it can NOT remain in any other resource group.
		- You can move resources from one resource group to another

	Azure Resource Manager
	-----------------------------
		- It is the management layer of Azure Resources
		- It provides the management layer that enables create, update, delete resources from Azure Subscriptin
		- It Create, Configure, Manage, Delete resources and resource groups
		- Automate applciation using tools and SDKs like Powershell, Azure Sea Ally, Azure Portal Rest API, client SDKs
		- It lets you control who in your organisation can perform specific actions on resources




Azure Compute Services
==============================
	- It is Microsoft's cloud based On demand computing service that organisation can use to run cloud based applciation and workload.'
	- It provides computing resources like Disks, CPUs, Memory, Networking and OS.
	- Resources are available on demand, and can be used in minutes or seconds
	- You only pay for what you use.
	- It provides a wide range of computing solutions that you can use for development and testing.
	- These computations include things like Linux, Windows Server, Microsoft SQL Server, Oracle, IBM and SAP

Azure Compute Resources : 
-------------------------------
	Azure VMs
	----------------
		- Use IaaS to provide computing power in the cloud.
		- VMs are the virtualize versions of physical computers.
		- Every virtual machine consists of a Virtual Processor, Memory, Storage and Networking Resources
		- Each Virtual Machine runs an Operating System that allows you to install and run the software on, just like a physical machine
		- Retain total control over the OS
		- You can customize all the software running on the VM
	
	VM Scale Sets
	--------------------
		- Designed for automatic scaling of identical VMs.
		- Make it easire to build large scale services that target big compute.
		- Scaling can be manual or automated or combination of two.

	App Services
	--------------------
		- It is PaaS offering to build, deploy, and scale enterprisegrade web, mobile, and API use.
		- You can meet Performance, Scalability, Security, and Compliance requirements.
		- A fully managed platform with no worry about infracture maintenance

	Functions
	-----------
		- They perform computation based on an event.
		- It is a Code only solution, when you only have to worry about the code that you want to run.
		- Used when you need to perform some task in response to an event like a timer or a message for some event.


- Azure Account Home --> Select any resource group --> New --> Windows Server Datacenter (Create a virtual Machine) --> give VM name (VM01) --> Tell the region --> In Administrator account --> Give Username and Password(User-Defined) --> Hybrid Benefits sets to No --> Disks --> change disk type to Standard HDD --> Networking --> Management --> Turn off boot diagnostics --> Advanced --> Tags --> Review and Create --> Create 



Azure Container Service
==================================
	- Container are a virtual environment. Unlike Virtual Machines, you do not manage OS. 
	- Containers are meant to be lightweight, anda re designed to be created, scaled out, and stopped dynamically.

	Azure Container Instances : A PaaS offering allows you to upload your containers, which it then will run.
	Azure Kubernets Service : A container orchestrator (a workflow management solution for the data center) service for managing large number of services.

	Deployement of Azure Instances : 
	------------------------------------
	Azure Homepage --> Create a resource --> Containers in Azure Marketplace --> Container Instances --> Give a Resource Group --> Give a name to container (any name) --> Give a region --> image name --> write mcr.microsoft.com/azuredocs/aci-helloworld --> Click Next --> Networking --> DNS Name Label --> give a name (my9878Instance) --> Advanced --> Tags --> Review and Create --> Create --> after complete go to resource --> copy the FQDN --> Open an incognito window --> paste and go 



Azure Network Services 
==================================
	- You can connect your cloud environment to your on prem infrastructure and services to facilitate a hybrid environment that provides your users the best possible experience.

	Networking Service types
	------------------------------
		Azure Virtual Networks
		--------------------------
		- allow several type of Azure Resources like Azure VMs to secuerly communicate with one another with the internet and with on-prem networks
		
		- After deployment it is scoped to a single region.
		
		- But we Can connect multiple virtual networks from different regions using virtual network peering.
		
		- It provides Isolation, Segmentation, and Communication with on-prem and cloud resources.
		
		Load Balancer
		-----------------
		- You can also root and filter network traffic as your load balancer provides a way to scale applications while creating high availability for them.
		
		- The load balancer supports Inbound and Outbound scenarios providing low latency and high throughput.
		
		- Use of load balancer gives load balance on incoming internet traffic and internal traffic across Azure services.
		
		- We can use it to port forward to specific traffic and for OutBound Connectivity for for VMs in your Virtual Network.

		VPN Gateway
		----------------------
		- It is a type of virtual network gateway that is used to send encrypted traffic over the public internet between an Azure virtual network and an on-prem Network
		- Using VPN provides a secure connection between on-prem network to Azure

		Azure Application Gateway
		---------------------------
		- It is a web traffic load balancer 
		- When users connect to your web-app through an application gateway, you can route traffic based on source IP address and port to a destination IP and port because this includes Web Application Firewall.
		- It includes redirection and session affinity features to ensure user remains connected to the same server.

		Content Delivery Network
		------------------------------
		- It is Distributed Network of Servers
		- Used to more-efficiently serve web contents to users.
		- Purpose is to get your content to end users with minimal latency by caching the context at strategically placed physical nodes that are situated across the world.

	Deployement of Azure Virtual Network
	-------------------------------------------
		Azure Home Page --> Go to resource group that you had created --> add --> In marketplace go to Networking --> Virtual Network --> Create --> Give a name (any name - myVnet) --> subnet name (any name - mySubnet) --> Create --> Again go to resource group --> refresh (3 times) --> Click on the virtual network that you just created (myVnet) 



****
Azure Data Category
==============================
	- 3 Types of data are in Azure
		1. Structured
		2. Semi-Structured
		3. Unstructured

	1. Structured Data
	------------------------
		Schema : Adheres to a schema with same data and with same properties/fields.
		Storage : Storable in relational database tables, with rows and columns
		Examples : Sensor data, Financial data

	2. Semi-Structured Data
	------------------------------
		Schema : Has an Ad Hoc Schema with less organised fields and properties.
		Storage : Non-relational Data or NoSql data, not storable in tables, rows and cloumns. Tags are used for storing.
		Example : Books, Blogs, JSON, HTML documents

	3. Unstructured Data
	---------------------------
		Schema : Has no designated Schema or data structure
		Storage : Non-relational or Blob data, no restrictions on data blobs contain.
		Example : PDFs, JPGs, Videos


Azure Storage Service
=============================
	- It is a service in Azure that you can use to store files, messages, tables and other types of information.
	- Organisation often use Azure Storage toast file shares and to provide storage that their developers can use to store working data.
	- As your storage can be used by WebSites, mobile applications, desktop applications, and any number of custom solutions that you might wanna design.
	- It also uses IaaS offering like VMs as well as many PaaS as a Service cloud offerings.

	- Common Storage services include in Azure are : 

			IaaS 							PaaS
			---------						----------
			Disks 							Containers
			Files 							Queues
											Tables

	Disks
		- Provide Disks that VMs, apps, and services can access and use as needed
		- Can be used when you need to store data persistently and access it from an attached Virtual Hard Disk.
		- Two Flavours : Managed and Un-Managed
		- Managed Diska are managed by Azure , Un-Managed Disks are managed by User/Customer
		- Helpful in Lift and Shift applciations that read and write data to persistent disks
		- Disks are available is different sizes and peformances
		- SSDs (Solid State Drives) perform the best at the highest price tag.

	Containers
		- Blob storage in Azure is based on Object Based Solution
		- Optimized for storing lots of Unstructured Data such as text/binary data
		- Blob Storage is choosen when you need to serve images or documents directly to a web browser or you will be storing files for distributed access.
		- In situation of video and audio, blob storage can be useful

	Files
		- Allows organisations to setup highly available network file shares that are accessible from anywhere via standard SMB(Server Message Block) protocol.
			
			SMB Protocol 
				The Server Message Block Protocol (SMB protocol) is a client-server communication protocol used for sharing access to files, printers, serial ports and other resources on a network. It can also carry transaction protocols for interprocess communication.
		- Multiple VMs can share same files with both read and write process just as they would on any on-prem file share
		- Data stored in files can be accessed using REST inteface or with storage client libraries
		- Accessibility separates it from everything else because you can access the files from anywhere in the world using an URL that points to the file and includes a Shared Access Signature token or SAS token.
		- It generate SAS token that are used to allow specific access to a private asset for specific amount of time.
		- Secure access
		- Easire migration on on-prem apps to Azure
		- Can be used to store configuration files for application, diagnostic logs, metrics and even crash dumps.

	Queues
		- Used to store and retrieve messages 
		- Queue messages can be upto 64KB in size and a queue can contain millions of them.
		- Highly Scalable
		- Messages can be processed asynchronously

	Tables
		- It is a NoSql data store
		- Designes to store large amounts of structured data
		- It accepts authenticate calls from both inside and outside Azure. 
		- Organisations generally use Tables to store Structured Non-relational Data
		- It is used when an organisation needs to store Terabytes of structured data sets that do not require complex joins foreign keys or stored procedures and can be denormalized for fast access.
		- Scales as the data increases, It scales to petabytes of data

	How to create Blob Storage / Container
	------------------------------------------------
	Azure Home Page --> Need to Create a storage account --> Go to Create a resources --> Search for storage --> Create --> Give a resource group name for deployment --> Give a name(must be unique) (myStorage9898) --> Select a location --> Replication --> Locally Redundant Storage(LRS) --> Networking --> Advanced --> Tags --> Review and Create --> Go to resources --> Containers --> +Container --> give a name (mycontainer)(any_name) --> OK --> select mycontainer --> Upload --> Browse and select a file --> Upload 



Azure Database Services
=================================
	- It is a collection of several different fully managed PaaS database Services that help reduce the time spend on managing databases
	- It offers enterprisegrade performance with built-in high availability
	- Built-in security, Automatic Monitoring, and Threat detection
	- Key database services include 
				Azure Cosmos DB
				Azure SQL DB
				DB Migration Service
				Azure DB for MYSQL
				Azure DB for PostgerSQL
				SQL server on VMs
				Azure DB for MariaDB
						...etc
				
							
	
	Azure Cosmos DB : It is a globally distributed db service that supports schema-less data, It enables you to elastically and independently scale throughput and storage across any number of Azures geographic regions

	Azure SQL DB : It is a relational Database As A Service (DaaS) based on the latest stable version of Microsoft SQL Server database engine. Fully managed high performance db that organisations can use to build data driven applications and web-sites using their programming languages. As it is a DaaS, there is no need for manage underlying infracture.

	Azure Migration Service : is a fully-managed service designed to enable seamless migrations from multiple database sources to Azure data platforms with minimal downtime via online migrations. It uses the Microsoft Data Migration Assistant to generate assessment reports that provide recommendations that can be followed to ensure that you make any required changes to prior to migration.

	https://azure.microsoft.com/product-categories/databases



Azure Management Tools
=========================================
	Different Management Tools
		- Azure Portal
		- Azure Powershell
		- Azure Mobile App
		- Azure REST API
		- Azure CLI
		- Azure Cloud Shell
		- Azure Advisor

	1. Azure Portal
	----------------------
		- Most common way to deploy ans manage Azure Resources
		- it is a public web-site that you can access via web browser.
		- After signing in you can create and manage all the Azure services.
		- You can deploy, delete and manage Azure Resources.
		- It doesnot offer any way to automate repetative tasks
	
	2. Azure Powershell
	------------------------
		- Most used command-line tool
		- It is a module that you add to windows powershell or to powershell core that you can use to connect to Azure subscription and to manage Azure Resources.
		- Azure powershell needs Windows Powershell to run.
		
		Command :
				New-AzVm -ResourceGroupName "MyResourceGroup" -Name "MyVm01" -Image "UbuntuLTS" - to create a VM.

	3. Azure CLI
	------------------
		- A cross platform command-line program that you can use to connect to Azure and to execute administrative commands against Azure Resources.
		- It can be run on Windows, Linux, MacOS

		Command :
			az vm create --resource-group MyResourceGroup --name MyVM --image UbuntuLTS --generate-ssh-keys - to create a VM

	4. Azure Cloud Shell
	-------------------------------
		- Browser based scripting environment
		- Allows you to choose the shell experience that suits you best.
		- It needs a storage account

	5. Azure Mobile App
	---------------------------
		- It does not offet the functionality like other tools
		- It allows to Access, Manage, and Monitor your Azure accounts and Resources from iOS or Andriod or tablet.
		- You can get important notifications and health alerts about the important health issues and diagnose and fix many issues.
		- It allows you to Start, Stop and Restart VMs and Web-Apps
		- You can use it to connect to Virtual Machines and to manage permissions with role-based access control.

	6. Azure REST APIs
	------------------------
		- These are service end points that support sets of HTTP operations or methods.
		- These operations provide Create, Retrieve, Update, Delete access to the services resources.
		- A Rest Api defines a set of functions that developers can use to perform requests and receive responses via HTTP protocols like gets and posts

	7. Azure Advisor
	-------------------------
		- Its a free service thst is built into Azure and it provides recommendations on high availability, security, performance and cost
		- It analyzes you deployed services and identifies ways that you can improve your environment across key areas. 


Create a VM with Powershell
====================================
	Azure Home Page --> Cloud Shell option (right option of seacrh bar) --> Write New-AzVm -ResourceGroupName "MyResourceGroup" -Name "MyVm01" -Image "UbuntuLTS" --> Enter --> Credentials --> Provide username and password --> write user : vmadmin, password : anything as per you --> Enter --> Go to MyResourceGroup --> Refresh --> Select MyVm01 --> see if the status is running or not.




Azure Marketplace 
===============================
	- It hepls to connect end users with Microsoft partners, Independent Software Vendors (ISVs), and start-ups that pffer solutions and services that are optimised to run on Azure.
	- This allows Azure customers, IT professionals, and cloud developers to find, try, purchase and provision and deploy applications and services from hundreds of different service providers all certified to tun on Azure 

	- Azure marketplace catalog spans across many different catagories 
			1. Open source container platforms
			2. Virtual Machine Images
			3. Databases
			4. Application build
			5. Deployment software
			6. Developer Tools
			7. Threat Detection
			8. Block chain
	- It allows you to provision end to end solution quickly and reliably.





Azure Solutions
==============================
	1. Internet Of Things
	-----------------------
		- IoT is the ability devices to collect data and then relay that data for analysis.
			- Azure IoT Central
			- Azure IoT Hub
		
		IoT Central
			- Fully managed global IoT SaaS solution that makes it easy to connect, monitor, manage yout IoT assets at scale
			- No cloud expertise necessary
		
		IoT Hub 
			- It is a managed service hosted in Azure that acts as a central message hub for bi-directional (device to cloud and vice-versa) communication between IoT application and devices.
			- It supports connectivity for virtually any device
			- IoT hub monitoring helps organisations maintain the health of their IoT solutions by allowing them to track events like device creation, device failure, and device connection.
		https://azure.microsoft.com/overview/iot/product-selector


	Deployment of IoT Hub
	----------------------------
		Azure Home Page --> Create a resource --> in Marketplace find Internet of Things --> IoT Hub --> Create --> Select a resource group --> Select the region --> Give a name to IoT Hub --> Next --> Review + Create --> Create --> Go to resources.


	2. Big Data and Analytics
	------------------------------
		- Azure SQL Data Warehouse
		- Azure HDInsight
		- Azure Data Lake Analytics

		Azure SQL Data Warehouse
			- It is a cloud-based Enterprise Data Warehouse(EDW) that leverages Massively Parallel Processing(MPP) to run complex queries quickly across petabytes of data.
			- Analysis queries that take days to complete on a traditional database system typically complete within hours when run in SQL Data Warehouse.

		Azure HDInsight
			- fully managed cloud based offering
			- It is an open-source analytics service for enterprises that makes it easire to process massive amount of data.
			- Faster and more cost-effective than traditional solutions.
			- It supports popular open-source frameworks and cluster types like Apache Spark, Apache Hadoop, Apache Kafka among others.

		Azure Data Lake Analytics/Big Data and Analytics
			- It is an on-demand analytics job service
			- Just write queries to transform the data and extract insights from it.
			- Scale up or down by choosing how much power that you need 
			- You only pay for your job when its running

		https//azure.microsoft.com/product-categories/analytics

		Azure Databricks
		-------------------
			- It is an Apache Spark based analytics platform that is optimised specifically for Microsoft Azure.
			- Its tightly integrated with Azure and it provides one click setup, streamlined workflows and an interactive workspace that data scientists, data engineers, and business analysts can use to collaborate with one another.
			- You can use Azure Databricks to read data from multiple datasources like Azure blob storage, Azure Data Lake Storage, Azure Cosmos DB, Azure Sql Data Warehouse


	3. Artificial Intelligence
	--------------------------------
		- In the context of cloud computing, AI encompasses a widerange of services, including Machine Leraning, which is considered the core service.
		- ML is a Technique that allows computers to leverage existing data to forecast future behaviours or outcomes.
		- Azure ML service provides a cloud-based environment used to test, develop, train, deploy, manage, and track machine learning tools.
		- Azure ML studio is a collaborative, drag-and-drop workspace where you can build, test and deploy ML solutions without needing to write code.
		https://azure.microsoft.com/overview/ai-platform


	4. Serverless Computing
	--------------------------
		- It is an environment hosted in cloud that allows you to run code.
		- It leverages cost-savings, scaling and performance, Pay for the resource that you use
			- Azure Functions
			- Azure Logic Apps
			- Azure Event Grid
		
		Azure Functions
			- It is used when you are only concerned with the code that you are running your service and no interest in deaing with underlying platform or infrastructure.
			- It use it when you need to perfir a tasks in response to an event.
			- They scale automatically, and they are perfect solution when demand is variable.
			- Charges only incurr when a function is triggered.
			- Azure Funtions are stateless, Means they behave as if they are restarted in response to an event.
			- Azure Functions can be connected to a Azure Storage Service.

		Azure Logic Apps
			- It is a cloud service that helps you automate and orchestrate tasks, business processes, and workflow when you need to integrate apps, data, systems, and services.
			- It simplifies the design and build-out of scalable solutions.
			- It allows you to perfirm app integrations, data integrations, system integrations, enterprise application integrations, business to business integrations.
			- Is is designed in a web-based designer
			- Over 200 connectors are available to help you build enterprise intergation solutions with Azure logic apps.
			- These connectors include services like Salesforce, SAP, Oracle DB and File Shares.

		Azure Event Grid
			- It is fully-managed, intelligent event routing service that uses a publish-subsrcibe model for uniform event consumption.
			- It provides built-in support for events coming from Azure services, like storage blobs and resource groups.
			- It supports custom non-azure based events in real time through the use of custom topics.

	
	5. Azure DevOps
	----------------------
		- DevOps - Development and Operations
		- It is the combination of people, processes, and technology to automate software delivery that provides value to end-user base. 
		
		- Azure DevOps services provides developent collaboration tools like pipelines(for application integration and development and delivery), git repositories, Kanban boards, and extensive automated and cloud-based load testing

		- Azure DevTest Labs allows you to quickly create environments in Azure while minimizing waste and controlling cost.

	6. Azure App Service
	-------------------------
		- It is a cloud offering that you can use to quickly and easily build web and mobile apps for any platform or device
		- It provides auto-scaling and high availability and it supports windows and linux.
		- It includes support for 
				- multiple languages and frameworks (ASP .Net, .Net Core, Java, Ruby, Node JS, PHP, Python, powershell)
				- DevOps optimization
				- Global Scale
				- high availability
				- Connectivity to SaaS platforms and op-prem data
				- Robust Security and compliance (ISO, SOC and PCI compliance)
				- Extensive selection of application templates (wordpress, June 1, Drupal)
				- Visual studio integration 
				- API and mobile features
				- Serverless code


	Create a Web App
	==========================
		Azure Home Page --> Create a resource --> Select Web App --> Assign to a resource group --> Give a unique name to your app --> Select the code(Runtime task) (Select .Net core 3.0) --> Tell the region --> Next --> Next --> Review + Create --> Go to resources --> Copy the url --> paste and search in a icognito window --> Configuration --> LookEverything --> Custom domain (In settings Column) ...




Security, Privacy, Compliance and Trust
======================================================
	Securing Network Connectivity
	---------------------------------------
		- A defence in depth strategy leverages a series of mechanisms to slow the advance of an attack that is aimed at acquring unauthorized access to data.
		- They include confidentiality, integrity, availability.
		- There are 6 layer of security
				1. Physical Security
				2. Identity and Access
				3. Perimeter
				4. Network
				5. Compute
				6. Application

	Shared Security Model
	-----------------------------

	Responsibility 							On-Prem 			IaaS 			PaaS 				SaaS 
	-------------------						-----------			--------		--------			------------
	Data Governance/ Rights Management 		Customer 			Customer 		Customer 			Customer
	Client Endpoints 						Customer 			Customer 		Customer 			Customer
	Account and Access Management 			Customer 			Customer 		Customer 			Customer
	Identity & Directory Infrastructure 	Customer 			Customer 		Microsoft/Customer  Microsoft/Customer
	Application 							Customer 			Customer 		Microsoft/Customer  Microsoft
	Network Controls 						Customer 			Customer 		Microsoft/Customer 	Microsoft
	Operating System 						Customer 			Customer 		Microsoft 			Microsoft
	Physical Hosts 							Customer 			Microsoft 		Microsoft 			Microsoft
	Physical Network 						Customer 			Microsoft 		Microsoft 			Microsoft
	Physical Datacenter 					Customer 			Microsoft 		Microsoft 			Microsoft

	Azure Firewall :
		- Microsofts managed Network security service in Azure that protects Azure virtual network resources.
		- It is a fully state full firewall as a Service that features built in high availability as well as virtually unlimited cloud scalability.
		- It uses static public IP address to represent the virtual network resources behind it.
		- This allows outside firewalls to identify traffic originating from the virtual Network
		- It is fully integrated with Azure monitor for logging and analytics
		- It provides built-in high availability, Unrestricted cloud scalability, Inbound and outbound filtering rules, and Azure monitor logging
		** Azure applciation gateway also provides a firewall called WAF(Web Applciation Firewall), which provides centralized inbound protection for web application.

	- A DDOS attack is to overwhelm an application and to exhaust its resources, what is does is to slow its applciation down to the point where it is unresponsive to its legitimate users
	- It provides Robust DDOS protection against DDOS attacks
	- There are 2 different Azure deeds protection service tiers : Basic and Standard
	- Basic tier is automatically enabled in Azure platform
	- Standard tier offers additional mitigation capabilities.

	NSGs
	-----------
		- Network Security Group
		- They filter network traffic to and from Azure resources connected to Azure Virtual Networks
		- Contains Inbound and Outbound Security Rules 
		- Supports as many rules as necessary, within subscription limits.
		- For each rule you must configure these prperties : 
				Name : Unique name of the Network Security Group
				Priority : A value between 100 to 4096 (lower the no, higher the priority)
				Source and destination : Individual IP address or IP address range, service tags, or application security 								group
				Protocol : TCP, UPD ,///any
				Direction : Whether rules apply to Inbound or Outbound traffic
				Port Range : An individual port or a range of ports
				Action : Allow or Deny

		- A default set of baseline security rules is created within new NSGs
		- Default rules can not be removed but we can override them with new, higher priority rules.

	ASGs
	------------
		- Application Security Group
		- You can configure network security as an extension of an application's structure'
		- It allows you to group virtual machines and then define network security policies based on those groupings, 
		- Key advantage : Ability to re-use security policies at scale without manually dealing with the maintainance of explicit IP addresses.
		- Azure handles the complexity of explicit IP addresses and multiple rule sets.

	- When designing an Azure Security Solution, its important to consider all aspects of defence in depth, beginning with the perimeter layer.
	- Perimeter layer is used to protect network boundaries using Azure DDOS protection and Azure Firewall
	- Network layer only allows traffic to pass between networked resources inbound and outbound rules defined



	Core Azure Identity Service
	===============================
		Authentication
			- Process of establishing the identity of an entity be it a person or service who is trying to access a resource
			- Challenges entity for credentials and provides the basis for creating a security and access control.

		Authorization
			- Separate process from authentication
			- Establishes what level of access and authentication an entity has.
			- Is specifies which data the entity has access and what he can do with the data.

		Azure Active Directory
			- Microsofts Azure-based identity & access management service
			- It provides services such as :
					Authentication (Verifying identity to access apps and resources)
					Single Sign-On (SSO)
					Application Management
					Business to Business (B2B)
					Business to Customer(B2C)
					Device Management

	Multi-Factor Authentication
		- Azure MFA
		- Provides added Security for user authentications by requiring 2 or more elements for authentication
		- It improves the security by limiting the impact of stolen credentials
		- MFA should be enables wherever possible


	Security Tools and Features
	=============================
		Azure Security Center
			- A robust Azure-based Monitoring Service, that is used to provide threat protection for services in Azure and on-premises.
			- It continuously monitors all services and performs automatic security assessments that are used to identify vulnerabilities before those vulnerabilities are exploited
			- It can use ML to detect and block malware
			- Allows you to define a list of allowed applications that you need to run
			- It can analyze amd identify possible inbound attacks and investigate threats
			- Two Service tores are available
					Free : Available with every Azure subscription, Limitied to assessments and recommendations of Azure resources only
					Standard : full suite of security-related service and features which includes continuous monitoring, threat detection, JIT access control for ports, and other resources

		Azure Key Vault
			- It stores application secrets in a centralized cloud location, to securely control access permission, and access logging.
			- Common use cases of this are :
				Secrets Management (tokens, passwords, certificates, APIs keys ...etc)
				Key Management (Create and control encryption keys)
				Certificate Management (Easy provisoned manage and deploy Public and Private SSl(Secure Socket Layer) and TLS(Transport Layer Security) certificates)
				Storing Secrets Backed by HSMs (Hardware Security Modules) 

			Benefits
			-----------
				- Centralized Application Secrets : Key valuts allows you to control distribution of secrets and it reduces the chances that the security gets leaked.
				- Securely store Secrets and keys : 
				- Monitor Access and Use
				- Simplified Application Secret Administration : easier to enroll and renew certificates from public certificate authorities
				- Integrate with other Azure Services

			Azure Information Protection
				Classify and Protect documents and emails by applying labels
				Labels can be applied by both Administrators or by Users, individually or together.

			Azure Advanced Threat Protection (ATP)
				ATP Portal : For monitoring and responding to suspicious activity
				ATP Sensors : Sensors installed directly to domain controllers
				ATP Cloud Service : It runs in Azure Infrastructure, currently deployed in US, Europe and Asia

	Azure Governance
	===========================
		Azure Policy
			- Used to create, assign and manage policies that enforce different rules and effects over your resources.
			- It uses policies and initiatives to accomplish forcing different rules and effects over the resources in the subscription.
			- It performs evaluations of your resources and scans for those that are not compliant.
			- It can Automatically remediate resources and configurations that are non-compliant
			- It includes several built-in policy and initiatives
					Storage 
					Networking
					Compute
					Security
					Monitoring
			- It can also integrate with Azure DevOps
			- Three step process : 
					Create Definition : defines what needs to be evaluated and what actions to take
					Assign Definition : A policy assignment is a policy definition i.e, been assigned to a specific scope
					Review Results : When a condition is evaluated, resources are marked compliant or non-compliant
			- Policy evaluation happens about once per hour

		Policy Initiatives
			- They work with Azure policies
			- They consists of Initiative Definition and Initiative Assignments
			Initiative Definition
				A group of policy definitions into a single unit, to track compliance at a higher scope.
			Initiative Assignments
				Minimize the need to create several Initiative Definition for each scope

		Role Based Access Control
			- Provides fine-grained access management for Azure Resources
			- IAM portal in Azure Portal
		
		Resource Locks
			- Used to prevent accidental deletion or modification of Azure resources. Locks are managed from within the Azure Portal.

		Azure BluePrint
			- Used to define repeatable sets of Azure resources that implemented and adhere to standards, patterns, and requirements
			- It is a declarative way to manage the deployment of many different resource templates and other artifacts, like role assignments, policy assignments, Azure resource manager, templates, and Resource groups.
			- Steps for implementation
				Create Azure BluePrint
				Assign the BluePrint
				Track the BluePrint

	Monitoring and Reporting
	==================================
		Tags
			- used to logically organize your Azure resources
			- It provides metadata for Azure Resources
			- Logically organize resources into a taxonomy.
			- Every tags is a pair of attributes {tag_name : tag_value}
			- Helps organize resources for billing or management
			
			Limitations
				Not all resource types support tags.
				Maximum 50 tags can be assigned to a resource
				Storage accounts only supports 15 tags
				Tag names are limited to 512 characters 
				Tag values are limited to 256 characters

		Azure Monitor
			- It allows you to collect, analyze, act upon telemetry from both cloud and on-prem environments
			- Monitoring data that you collect for applications is split into several buckets or tiers
					Applications Monitoring Data
					Guest OS Monitoring Data
					Azure Resource Monitoring Data
					Azure Subscriptin Monitoring Data
					Azure Tenant Monitoring Data

		Azure Service Health
			- It provides personalized guidance and support whenever issues with Azure service affects you.
			- It consists of major 3 components :
					Azure Status
					Azure Health
					Azure Resource Health

		Monitoring Apps and Services
			- Data Monitoring helps you if you can use it to gain visibility into the operation of your computing environment.
			- You can integrate Azure Monitor with other Azure services to improve data monitoring and to gain better insights into operations.
			- Features : 
				Analyze - Application insights, Azure Monitor for containers, Azure Monitor for VMs
				Respond - Emails or texts , Automated Process
				Visualize - Charts, Tables, Dashboards, Views
				Integrate - Other Azure services can work with Azure Monitor


	Rest are Histroy
	

























