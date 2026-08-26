use crate::Solvable;

pub struct P009;
impl Solvable for P009 {
    fn problem_name(&self) -> &str { "p009" }
    fn solve(&self) -> i64 {
        let target = 1000i64;
        for a in 1..target - 2 {
            for b in a + 1..target - 1 {
                let c_sq = a * a + b * b;
                let c = (c_sq as f64).sqrt() as i64;
                if c * c == c_sq && a + b + c == target {
                    return a * b * c;
                }
            }
        }
        0
    }
}
