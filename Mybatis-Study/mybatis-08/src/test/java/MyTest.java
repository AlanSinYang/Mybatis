import com.kuang.dao.BlogMapper;
import com.kuang.pojo.Blog;
import com.kuang.utils.IDUtils;
import com.kuang.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

public class MyTest {
    @Test
    public void addInitBlog(){
        SqlSession session = MybatisUtils.getSqlSession();
        BlogMapper mapper = session.getMapper(BlogMapper.class);

        Blog blog = new Blog();
        blog.setId(IDUtils.getId());
        blog.setTitle("Mybatis简单");
        blog.setAuthor("小阳");
        blog.setCreateTime(new Date());
        blog.setViews(1234);

        mapper.addBlog(blog);

        blog.setId(IDUtils.getId());
        blog.setTitle("Java简单");
        mapper.addBlog(blog);
        blog.setCreateTime(new Date());
        blog.setViews(2233);

        blog.setId(IDUtils.getId());
        blog.setTitle("Spring简单");
        mapper.addBlog(blog);
        blog.setCreateTime(new Date());
        blog.setViews(1122);

        blog.setId(IDUtils.getId());
        blog.setTitle("微服务简单");
        mapper.addBlog(blog);
        blog.setCreateTime(new Date());
        blog.setViews(3344);

        session.close();
    }

    @Test
    public void queryBlogIF() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
        HashMap map = new HashMap();
        //map.put("title","java简单2");
        map.put("author", "阳仔");
        map.put("id", "6");
        //map.put("id", "2");
        //map.put("id", "3");
        //map.put("id", "4");
        //map.put("views",6666);


        //查询博客
        //List<Blog> blogs = mapper.queryBlogIF(map);
        //for (Blog blog : blogs) {
        //   System.out.println(blog);
        //}

        //更新博客
        mapper.updateBlog(map);

        sqlSession.close();
    }


    @Test
    public void queryBlogForach(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);

         HashMap  map = new HashMap();

        ArrayList<Integer> ids = new ArrayList<Integer>();

        //查询1-2-3号的博客信息
        //ids.add(1);
        //ids.add(2);
        //ids.add(3);
        ids.add(4);


        map.put("ids",ids);
        List<Blog> blogs =  mapper.queryBlogForach(map);

        for (Blog blog : blogs) {
            System.out.println(blog);
        }

        sqlSession.close();
    }

}
