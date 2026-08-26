use crate::Solvable;

const P018_DATA: &str = include_str!("p018.txt");

pub struct P018;
impl Solvable for P018 {
    fn problem_name(&self) -> &str { "p018" }
    fn solve(&self) -> i64 {
        let mut triangle: Vec<Vec<i64>> = P018_DATA.trim().lines().map(|line| {
            line.split_whitespace().map(|n| n.parse().unwrap()).collect()
        }).collect();
        let n = triangle.len();
        for i in (0..n - 1).rev() {
            for j in 0..=i {
                let best = triangle[i + 1][j].max(triangle[i + 1][j + 1]);
                triangle[i][j] += best;
            }
        }
        triangle[0][0]
    }
}
