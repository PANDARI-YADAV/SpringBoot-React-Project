package springRest.RestDemo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import springRest.RestDemo.Service.JobService;
import springRest.RestDemo.model.JobPost;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class JobController {

    @Autowired
    public JobService service;

    @GetMapping("jobPosts")
    public List<JobPost> getAllJobs() {
      return  service.getAllJobs();
    }


    @GetMapping("jobPost/{postId}")
    public JobPost getJob(@PathVariable int postId){
        return service.getJob(postId);
    }
    @PostMapping("jobPost")
    public void addJob(@RequestBody  JobPost jobpost){
        service.addJob(jobpost);

    }

    @GetMapping("jobPost/keyword/{keyword}")
    public List<JobPost> searchByKeyword(@PathVariable("keyword") String keyword){
        return service.search(keyword);
    }

    @PutMapping("jobPost")
    public void updateJob(@RequestBody JobPost jobpost){
         service.updateJob(jobpost);
    }

    @DeleteMapping("jobPost/{id}")
    public String deleteJob(@PathVariable("id") int postId){
        service.deleteJob(postId);
        return "Deleted";
    }

    @GetMapping("load")
    public String loadData(){
        service.load();
    return "Data Loaded";
    }

}
