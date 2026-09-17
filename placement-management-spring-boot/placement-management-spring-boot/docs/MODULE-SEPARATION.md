# Module Separation

The assignment has six modules:
Student, Certificate, Placement, College, Admin, User.

Each module contains:
module/
  controller/
  entity/
  repository/
  service/

Common files stay in every individual submission:
- pom.xml
- PlacementManagementApplication.java
- HealthController.java
- application.properties

Example Student-only project:
com/placementmanagement/management/
  PlacementManagementApplication.java
  HealthController.java
  student/
    controller/
    entity/
    repository/
    service/

Remove the other module folders only after checking imports/dependencies.

For the final combined project, keep all six module folders under the same package.
